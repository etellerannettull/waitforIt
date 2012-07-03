package oppgaver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Oppgave1 {

	public String formaterDato(Date date) {
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.YYYY HH:mm");
		return sf.format(date);
	}

	public String leggTilTimer(Calendar cal, int antallTimer) {
		cal.setTimeInMillis(cal.getTimeInMillis() + (antallTimer * 60 * 60 * 1000));
		// Fungerer å sette HOUR_OF_DAY, men skjønner ikke hvordan den skjønner
		// døgnovergang... :)
		// cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) +
		// antallTimer);
		return formaterDato(cal.getTime());
	}

	public String finnTidspunktForLanding(int år, int måned, int dag, int time, int minutt, String tidssone, int antallTimer) {
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(tidssone));
		cal.set(år, måned - 1, dag, time, minutt);
		return leggTilTimer(cal, antallTimer);
	}

	// Clojureløsning fra Bodil: :)
	// (rule-ints #".*leaves from Paris (\d+)\.(\d+)\.(\d+) at (\d+):(\d+)\. It
	// takes (\d+) minutes.*"
	// [y mo d h m duration]
	// (let [startmins (+ (* h 60) m)]
	// (let [endmins (+ startmins duration)]
	// (str y "." mo "." d " at " (padzero (int (/ endmins 60))) ":" (padzero
	// (mod endmins 60))))))
	//
	// (rule-ints #".*leaves (\d+)\.(\d+)\.(\d+) at (\d+):(\d+)\. It takes (\d+)
	// minutes.*"
	// [y mo d h m duration]
	// (let [startmins (+ (* h 60) m)]
	// (let [endmins (+ startmins (+ duration 60))]
	// (str y "." mo "." d " at " (padzero (int (/ endmins 60))) ":" (padzero
	// (mod endmins 60))))))
	// (rule-ints #".*Rome takes off (\d+)\.(\d+)\.(\d+) at (\d+):(\d+)\. It
	// takes (\d+) minutes.*"
	// [y mo d h m duration]
	// (let [startmins (+ (* h 60) m)]
	// (let [endmins (+ startmins duration)]
	// (str y "." mo "." d " at " (padzero (int (/ endmins 60))) ":" (padzero
	// (mod endmins 60))))))
	//
	// (rule-ints #".*New Your takes off (\d+)\.(\d+)\.(\d+) at (\d+):(\d+)\. It
	// takes (\d+) minutes.*"
	// [y mo d h m duration]
	// (let [startmins (+ (* h 60) m)]
	// (let [endmins (+ startmins (+ 360 duration))]
	// (str y "." mo "." d " at " (padzero (int (/ endmins 60))) ":" (padzero
	// (mod endmins 60))))))

}

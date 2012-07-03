package oppgaver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Oppgave1 {

	public String formaterTidspunkt(Calendar cal) {
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.YYYY HH:mm");
		return sf.format(cal.getTime());
	}

	public void leggTilTimer(Calendar cal, int antallTimer) {
		// cal.setTimeInMillis(cal.getTimeInMillis() + (antallTimer * 60 * 60 *
		// 1000));
		cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) + antallTimer);
	}

	public String finnTidspunktForLanding(int år, int måned, int dag, int time, int minutt, String tidssoneTarAv, String tidssoneLanding, int antallTimer) {
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(tidssoneTarAv));
		cal.set(år, måned - 1, dag, time, minutt);
		// System.out.println(formaterTidspunkt(cal) +
		// cal.getTime().toString());
		// cal.setTimeZone(TimeZone.getTimeZone(tidssoneLanding));
		// System.out.println(formaterTidspunkt(cal) +
		// cal.getTime().toString());
		leggTilTimer(cal, antallTimer);
		// System.out.println(formaterTidspunkt(cal) +
		// cal.getTime().toString());
		return formaterTidspunkt(cal);
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

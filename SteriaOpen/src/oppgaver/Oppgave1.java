package oppgaver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Oppgave1 {

	public String formaterDato(Date date) {
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.YYYY HH:mm");
		return sf.format(date);
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

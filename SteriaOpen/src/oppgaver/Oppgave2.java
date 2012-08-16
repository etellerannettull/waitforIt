package oppgaver;

import java.util.Map;
import java.util.Map.Entry;

public class Oppgave2 {

	private static final String KJELL = "Kjell";

	public String finnKjell(Map<String, String> kart) {
		boolean kjellFinnes = false;
		for (Entry<String, String> sjefenTil : kart.entrySet()) {
			kjellFinnes |= sjefenTil.getKey().equals(KJELL) || sjefenTil.getValue().equals(KJELL);
		}
		if (!kjellFinnes) {
			return "NOKJELL";
		} else {

			String sjefenTil = KJELL;
			int stegOpp = 0;
			while (finnSjefenTil(sjefenTil, kart) != null) {
				stegOpp++;
				sjefenTil = finnSjefenTil(sjefenTil, kart);
			}

			return "" + stegOpp;
		}
	}

	private String finnSjefenTil(String navn, Map<String, String> kart) {
		for (Entry<String, String> sjefenTil : kart.entrySet()) {
			if (sjefenTil.getValue().equals(navn)) {
				return sjefenTil.getKey();
			}
		}
		return null;
	}

}

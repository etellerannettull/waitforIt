package oppgaver;

public class Oppgave7 {

	public String finnPalindrom(String tekst) {
		int venstre = 0;
		int h�yre = tekst.length() - 1;

		int antall = 0;

		while (venstre < h�yre) {
			if (tekst.charAt(venstre) != tekst.charAt(h�yre)) {
				break;
			}

			venstre++;
			h�yre--;
			antall++;
		}

		return antall == tekst.length() / 2 ? "PALINDROM-TOM" : "" + antall;
	}

}

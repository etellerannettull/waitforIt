package oppgaver;

// Palindrom-Tom
public class Oppgave7 {

	public String finnPalindrom(String tekst) {
		int venstre = 0;
		int høyre = tekst.length() - 1;

		int antall = 0;

		while (venstre < høyre) {
			if (tekst.charAt(venstre) == tekst.charAt(høyre)) {
				antall++;
			}

			venstre++;
			høyre--;
		}

		return antall == tekst.length() / 2 ? "TACOCAT" : "" + antall;
	}

}

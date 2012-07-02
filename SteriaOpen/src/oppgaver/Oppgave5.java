package oppgaver;

// ROT13, Zed Shaw
public class Oppgave5 {

	public String finnRot13(String tekst) {
		char[] nyeBokstaver = new char[tekst.length()];
		for (int i = 0; i < tekst.length(); i++) {
			char c = tekst.charAt(i);
			int nyPlassering = (int) c;

			if (nyPlassering >= (int) 'A' && nyPlassering <= (int) 'z') {
				nyPlassering = (int) c + 13;

				if ((Character.isLowerCase(c) && nyPlassering > (int) 'z')
						|| (Character.isUpperCase(c) && nyPlassering > (int) 'Z')) {
					nyPlassering = nyPlassering - 26;
				}
			}
			nyeBokstaver[i] = (char) nyPlassering;
		}

		return new String(nyeBokstaver);
	}
}

package oppgaver;

// ROT13, Zed Shaw
public class Oppgave5 {

	// Lånt litt(mye) fra http://en.literateprograms.org/Rot13_(Java)#chunk def:encode c  :)
	public String finnRot13(String tekst) {
		if(tekst == null) return null;
		
		String nyTekst = new String();
		for (int i = 0; i < tekst.length(); i++) {
			char c = tekst.charAt(i);
			
			if      (c >= 'a' && c <= 'm') c += 13;
			else if (c >= 'n' && c <= 'z') c -= 13;
			else if (c >= 'A' && c <= 'M') c += 13;
			else if (c >= 'N' && c <= 'Z') c -= 13;
			
			nyTekst += c;
			
		}

		return nyTekst;
	}
}

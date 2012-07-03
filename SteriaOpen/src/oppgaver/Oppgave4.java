package oppgaver;


public class Oppgave4 {
	char farge = '0';
	
	public char tellFlokker(char[][] tegn) {
		
		
		for (int i = 0; i < tegn.length; i++) {
			for (int j = 0; j < tegn[0].length; j++) {
				if(tegn[i][j] == 'S') {
					fargeleggOgSjekkNaboer(tegn, i, j);
					farge++;
				}
			}
		}

		return farge;
	}

	private void fargeleggOgSjekkNaboer(char[][] tegn, int i, int j) {
		tegn[i][j] = farge;
		
		if(i > 0 && tegn[i-1][j] == 'S') { //sjekk over
			fargeleggOgSjekkNaboer(tegn, i-1, j);
		}
		if(j > 0 && tegn[i][j-1] == 'S') { //sjekk venstre
			fargeleggOgSjekkNaboer(tegn, i, j-1);
		}
		if(i < tegn.length-1 && tegn[i+1][j] == 'S') { //sjekk under
			fargeleggOgSjekkNaboer(tegn, i+1, j);
		}
		if(j < tegn[0].length-1 && tegn[i][j+1] == 'S') { //sjekk høyre
			fargeleggOgSjekkNaboer(tegn, i, j+1);
		}
	}

}

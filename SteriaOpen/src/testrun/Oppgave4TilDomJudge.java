package testrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Oppgave4TilDomJudge {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");

	public static void main(String[] args) throws Exception {

		int antallTestcase = readInt();
		for (int j = 0; j < antallTestcase; j++) {
			int antallLinjerNedover = readInt();
			int antallLinjerBortover = readInt();
			
			char[][] folk = new char[antallLinjerNedover][antallLinjerBortover];
			
			for (int i = 0; i < antallLinjerNedover; i++) {
				folk[i] = readLine().toCharArray();
			}
			System.out.println(tellFlokker(folk));
		}
	}
	
	static char farge = '0';
	private static int[] antallAvHver = new int[150];
	
	static int tellFlokker(char[][] tegn) {
		
		
		for (int i = 0; i < tegn.length; i++) {
			for (int j = 0; j < tegn[0].length; j++) {
				if(tegn[i][j] == 'S') {
					fargeleggOgSjekkNaboer(tegn, i, j);
					farge++;
				}
			}
		}
		
		int antall = tellFargerMedFlereEnnTre();
		antallAvHver = new int[150];
		farge = '0';
		return antall;
	}

	private static int tellFargerMedFlereEnnTre() {
		int flokker = 0;
		for (int antall : antallAvHver) {
			if(antall >= 3) {
				flokker++;
			}
		}
		return flokker;
	}

	private static void fargeleggOgSjekkNaboer(char[][] tegn, int i, int j) {
		tegn[i][j] = farge;
		antallAvHver[farge - '0']++;
		
		if(i > 0 && tegn[i-1][j] == 'S') { //sjekk over
			fargeleggOgSjekkNaboer(tegn, i-1, j);
		}
		if(j > 0 && tegn[i][j-1] == 'S') { //sjekk venstre
			fargeleggOgSjekkNaboer(tegn, i, j-1);
		}
		if(i < tegn.length-1 && tegn[i+1][j] == 'S') { //sjekk under
			fargeleggOgSjekkNaboer(tegn, i+1, j);
		}
		if(j < tegn[0].length-1 && tegn[i][j+1] == 'S') { //sjekk hoyre
			fargeleggOgSjekkNaboer(tegn, i, j+1);
		}
	}

	static String readLine() throws Exception {
		return stdin.readLine();
	}
	
	// Read next input-token as string.
	static String readString() throws Exception {
		while (!st.hasMoreTokens()) {
			st = new StringTokenizer(stdin.readLine());
		}
		return st.nextToken();
	}

	// Read next input-token as integer.
	static int readInt() throws Exception {
		return Integer.parseInt(readString());
	}

	// Read next input-token as double.
	static double readDouble() throws Exception {
		return Double.parseDouble(readString());
	}

	static BigDecimal summer(BigDecimal... tall) {
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal t : tall) {
			if (t.signum() > 0)
				sum = sum.add(t);
		}

		return sum;
	}
}

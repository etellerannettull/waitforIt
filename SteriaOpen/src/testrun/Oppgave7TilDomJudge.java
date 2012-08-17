package testrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Oppgave7TilDomJudge {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");

	public static void main(String[] args) throws Exception {

		int antallTestcase = readInt();
		for (int i = 0; i < antallTestcase; i++) {
			System.out.println(finnPalindrom(readLine()));
		}
	}
	
	static String finnPalindrom(String tekst) {
		int venstre = 0;
		int hoyre = tekst.length() - 1;

		int antall = 0;

		while (venstre < hoyre) {
			if (tekst.charAt(venstre) == tekst.charAt(hoyre)) {
				antall++;
			}

			venstre++;
			hoyre--;
		}

		return antall == tekst.length() / 2 ? "TACOCAT" : "" + antall;
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

}

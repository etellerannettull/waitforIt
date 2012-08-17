package testrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Oppgave3TilDomJudge {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");

	public static void main(String[] args) throws Exception {

		int antallTestcase = readInt();
		for (int j = 0; j < antallTestcase; j++) {
			int antallProsjekt = readInt();
			BigDecimal[] prosjekter = new BigDecimal[antallProsjekt];
			for (int i = 0; i < antallProsjekt; i++) {
				prosjekter[i] = new BigDecimal(readString());
			}
			System.out.println(summer(prosjekter));
		}
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

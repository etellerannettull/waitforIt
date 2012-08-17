package testrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Oppgave8TilDomJudge {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");

	public static void main(String[] args) throws Exception {

		int antallTestcase = readInt();
		for (int i = 0; i < antallTestcase; i++) {
			System.out.println(finnBonus(readInt()));
		}
	}
	
	static BigInteger finnBonus(int antallaar) {
		if(antallaar == 1) return BigInteger.ZERO;
		if(antallaar == 2) return new BigInteger("1000");
		
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		
		for (int i = 2; i < antallaar; i++) {
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return b.multiply(new BigInteger("1000"));
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

package oppgaver;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.junit.Test;

public class ReadInputTest {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = new StringTokenizer("");

	@Test
	public void testName() throws Exception {
		assertEquals("Test", readLine());
	}

	static String readLine() throws Exception {
		return stdin.readLine();
	}

	static String readWord() throws Exception {
		while (!st.hasMoreTokens()) {
			st = new StringTokenizer(stdin.readLine());
		}
		return st.nextToken();
	}

	// Read next input-token as integer.
	static int readInt() throws Exception {
		return Integer.parseInt(readLine());
	}

	// Read next input-token as double.
	static double readDouble() throws Exception {
		return Double.parseDouble(readLine());
	}

}

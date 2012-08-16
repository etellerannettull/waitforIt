package generator;

import java.math.BigDecimal;

import oppgaver.Oppgave3;

public class Oppgave3TestdataGenerator {

	private static final String NEW_LINE = "\n";

	public static void main(String[] args) {
		BigDecimal[][] tall = {
				{ new BigDecimal(100000), new BigDecimal(200000), new BigDecimal(300000) },
				{ new BigDecimal(-30000), new BigDecimal(20000) },
				{ new BigDecimal(-30000000), new BigDecimal(20000), new BigDecimal(523000), new BigDecimal(1234567890) },
				{ new BigDecimal(1230), new BigDecimal(20), BigDecimal.TEN },
				{ new BigDecimal("99999999999999"), new BigDecimal("99999999999999"), new BigDecimal("99999999999999"), new BigDecimal("99999999999999"),
						new BigDecimal("99999999999999"), new BigDecimal("99999999999999"), new BigDecimal("99999999999999"), new BigDecimal("99999999999999"),
						new BigDecimal("99999999999999"), new BigDecimal("99999999999999"), new BigDecimal("99999999999999") },
				{ new BigDecimal(-30000), new BigDecimal(-20000) },
				{ new BigDecimal(123), new BigDecimal(456) },
				{ new BigDecimal(-30000), new BigDecimal(-20000) },
				{ new BigDecimal(123456), new BigDecimal(987654) },
				{ new BigDecimal(1), new BigDecimal(-20000) },
				{ new BigDecimal(39284032), new BigDecimal("98327309827498327429") },
				{ new BigDecimal(303), new BigDecimal("-99999999999999") },
				{ new BigDecimal(3002323), new BigDecimal(-23432), new BigDecimal(3298742), new BigDecimal(0) },
				{ new BigDecimal(-30000), new BigDecimal(-20000) },
				{ new BigDecimal(404), new BigDecimal(404) },
				{ new BigDecimal(-1), new BigDecimal(-2), new BigDecimal(-3), new BigDecimal(-4) },
				{ new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123),
						new BigDecimal(123), new BigDecimal(456), new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456),
						new BigDecimal(123), new BigDecimal(-123), new BigDecimal(123), new BigDecimal(456) },
				{ new BigDecimal(-30000), new BigDecimal(-20000) }, { new BigDecimal(123), new BigDecimal(456) } };
		System.out.println(genererInputFil(tall));
		System.out.println("----------------------");
		System.out.println(genererOutputFil(tall));
	}

	private static String genererOutputFil(BigDecimal[][] tall) {
		Oppgave3 opg = new Oppgave3();
		StringBuilder builder = new StringBuilder();

		for (BigDecimal[] tallarray : tall) {
			builder.append(opg.summer(tallarray)).append(NEW_LINE);
		}

		return builder.toString();
	}

	private static String genererInputFil(BigDecimal[][] tall) {
		StringBuilder builder = new StringBuilder();

		builder.append(tall.length).append(NEW_LINE);
		for (BigDecimal[] tallarray : tall) {
			builder.append(tallarray.length).append(NEW_LINE);
			for (BigDecimal i : tallarray) {
				builder.append(i).append(NEW_LINE);
			}
		}

		return builder.toString();
	}

	// 2 600000
	// 3 20000
	// 100000
	// 200000
	// 300000
	// 2
	// -30000
	// 20000

}

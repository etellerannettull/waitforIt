package generator;

import oppgaver.Oppgave8;

public class Oppgave8TestdataGenerator {

	private static final String NEW_LINE = "\n";

	public static void main(String[] args) {
		int[] år = { 4, 1, 5, 8, 7, 50, 21, 14, 20, 59, 2, 22, 3, 33, 44, 55, 23, 42, 12 };
		System.out.println(genererInputFil(år));
		System.out.println("----------------------");
		System.out.println(genererOutputFil(år));
	}

	private static String genererOutputFil(int[] år) {
		Oppgave8 opg = new Oppgave8();
		StringBuilder builder = new StringBuilder();
		for (int antallår : år) {
			builder.append(opg.finnBonus(antallår)).append(NEW_LINE);
		}

		return builder.toString();
	}

	private static String genererInputFil(int[] år) {
		StringBuilder builder = new StringBuilder();
		builder.append(år.length).append(NEW_LINE);
		for (int antallÅr : år) {
			builder.append(antallÅr).append(NEW_LINE);
		}

		return builder.toString();
	}

	// 3 0
	// 1 3000
	// 5 34000
	// 10
}

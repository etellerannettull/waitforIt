package generator;

import oppgaver.Oppgave7;

public class Oppgave7TestdataGenerator {

	private static final String NEW_LINE = "\n";

	public static void main(String[] args) {
		String[] telefonnummer = { "41587514", "97144179", "12345678", "98766789", "98761729", "82731923", "12989821", "11111111", "21344231", "98273113",
				"92744321", "98808821", "93448063", "97688279", "90911518", "93449432", "91827338", "19288291", "13249832", "98713789", "98766574" };
		System.out.println(genererInputFil(telefonnummer));
		System.out.println("----------------------");
		System.out.println(genererOutputFil(telefonnummer));
	}

	private static String genererOutputFil(String[] telefonnummer) {
		Oppgave7 opg = new Oppgave7();
		StringBuilder builder = new StringBuilder();
		for (String string : telefonnummer) {
			builder.append(opg.finnPalindrom(string)).append(NEW_LINE);
		}

		return builder.toString();
	}

	private static String genererInputFil(String[] telefonnummer) {
		StringBuilder builder = new StringBuilder();
		builder.append(telefonnummer.length).append(NEW_LINE);
		for (String string : telefonnummer) {
			builder.append(string).append(NEW_LINE);
		}

		return builder.toString();
	}

	// 2 3
	// 41587514 TACOCAT
	// 97144179
}

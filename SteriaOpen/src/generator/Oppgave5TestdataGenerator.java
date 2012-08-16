package generator;

import oppgaver.Oppgave5;

public class Oppgave5TestdataGenerator {

	private static final String NEW_LINE = "\n";

	public static void main(String[] args) {
		String[] ord = {
				"programming, motherfucker",
				"steria open",
				"zed shaw",
				"Hei hå",
				"Tjoho!",
				"ÅÅÅÅå ja!",
				"tåregaffel",
				"kjøleskapreparatørspisetest",
				"arachnoidea",
				"Hva skjer a'?",
				"rutebilstasjon",
				"Programmeringsord",
				"TestinzZ",
				"Hm..fønker dette?",
				"CAN I HAS CH3ZBURG3R",
				"Lorem Ipsum",
				" rett og slett",
				"dummyTekst!",
				"f0r trykkeindustri1",
				"Lårem Ipsum",
				"vÆrt bransj4ns",
				"st4ndard.. for, dummytekst",
				"PLZ",
				"Programming rockZ",
				"helt sidenâaÂ",
				"skal äS",
				" 1500-tallet, da",
				"    en ukjent boktrykker",
				"å lage et prøveeksemplar av en bok",
				"Lorem Ipsum har tålt tidens tann usedvanlig godt, og har i tillegg til å bestå gjennom fem århundrer også tålt spranget over til elektronisk typografi uten vesentlige endringer. " };
		System.out.println(genererInputFil(ord));
		System.out.println("----------------------");
		System.out.println(genererOutputFil(ord));
	}

	private static String genererOutputFil(String[] ord) {
		Oppgave5 opg = new Oppgave5();
		StringBuilder builder = new StringBuilder();
		for (String string : ord) {
			builder.append(opg.finnRot13(string)).append(NEW_LINE);
		}

		return builder.toString();
	}

	private static String genererInputFil(String[] ord) {
		StringBuilder builder = new StringBuilder();
		builder.append(ord.length).append(NEW_LINE);
		for (String string : ord) {
			builder.append(string).append(NEW_LINE);
		}

		return builder.toString();
	}

	// 3
	// programming, motherfucker cebtenzzvat, zbgureshpxre
	// steria open fgrevn bcra
	// zed shaw mrq funj
	//
}

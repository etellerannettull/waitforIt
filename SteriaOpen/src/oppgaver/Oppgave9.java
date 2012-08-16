package oppgaver;

public class Oppgave9 {

	private int antallEtasjer;
	private int lavesteEtasje;
	private int høyesteEtasje;
	private int knapp1;
	private int knapp2;

	public void setAntallEtasjer(int antallEtasjer) {
		this.antallEtasjer = antallEtasjer;
	}

	public void setEtasjeRangeHvorDøreneÅpnes(int lavesteEtasje, int høyesteEtasje) {
		this.lavesteEtasje = lavesteEtasje;
		this.høyesteEtasje = høyesteEtasje;
	}

	public void setKnapper(int knapp1, int knapp2) {
		this.knapp1 = knapp1;
		this.knapp2 = knapp2;
	}

	public int finnAntallTrekk(int i, int j, int k, int l, int m) {
		finnAntallTrekkFor(i);
		return 0;
	}

	int finnAntallTrekkFor(int i) {
		if (i + knapp1 >= lavesteEtasje && i + knapp1 <= høyesteEtasje || i + knapp2 >= lavesteEtasje && i + knapp2 <= høyesteEtasje)
			return 1;

		return 0;
	}
}

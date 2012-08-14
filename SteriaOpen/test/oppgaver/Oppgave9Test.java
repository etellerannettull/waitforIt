package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Oppgave9Test {

	@Test
	public void skal_finne_antall_trekk_for_testsett() {
		Oppgave9 opg = new Oppgave9();
		opg.setAntallEtasjer(49);
		opg.setEtasjeRangeHvorDøreneÅpnes(21, 25);
		opg.setKnapper(8, -13);

		assertEquals(opg.finnAntallTrekk(17, 26, 20, 19, 31), 8);
	}

}

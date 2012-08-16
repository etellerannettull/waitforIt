package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Oppgave9Test {
	private Oppgave9 opg = new Oppgave9();

	@Before
	public void setUp() {
		opg.setAntallEtasjer(49);
		opg.setEtasjeRangeHvorDøreneÅpnes(21, 25);
		opg.setKnapper(8, -13);
	}

	@Test
	public void testskal_finne_antall_trekk_for_en_heis() throws Exception {
		assertEquals(opg.finnAntallTrekkFor(17), 1);
		assertEquals(opg.finnAntallTrekkFor(26), 2);
	}

	@Test
	public void skal_finne_antall_trekk_for_testsett() {
		assertEquals(opg.finnAntallTrekk(17, 26, 20, 19, 31), 8);
	}

}

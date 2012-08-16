package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Oppgave1Test {

	Oppgave1 opg = new Oppgave1();

	@Test
	public void skal_finne_minst_antall_trekk_testdata1() {
		int[] utgangspos = { 1, 0, 2, 4, 5, 3, 7, 8, 6 };
		int antallTrekk = opg.finnMinstAntallTrekk(utgangspos);
		assertEquals(3, antallTrekk);
	}

	@Test
	public void skal_finne_minst_antall_trekk_umulig_testdata2() {
		int[] utgangspos = { 1, 2, 3, 4, 5, 6, 8, 7, 0 };
		int antallTrekk = opg.finnMinstAntallTrekk(utgangspos);
		assertEquals(-1, antallTrekk); // umulig
	}
}

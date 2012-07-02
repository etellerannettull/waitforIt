package oppgaver;

import static org.junit.Assert.*;

import org.junit.Test;

public class Oppgave5Test {
	
	@Test
	public void skal_takle_null() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13(null);
		assertEquals(null, rot13);
	}
	
	@Test
	public void skal_finne_rot13_av_a() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("a");
		assertEquals("n", rot13);
	}

	@Test
	public void skal_finne_rot13_av_b() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("b");
		assertEquals("o", rot13);
	}

	@Test
	public void skal_finne_rot13_av_ab() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("ab");
		assertEquals("no", rot13);
	}

	@Test
	public void skal_finne_rot13_av_n() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("n");
		assertEquals("a", rot13);
	}

	@Test
	public void skal_finne_rot13_av_A() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("A");
		assertEquals("N", rot13);
	}

	@Test
	public void skal_finne_rot13_av_N() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("N");
		assertEquals("A", rot13);
	}

	@Test
	public void skal_finne_rot13_av_AnN() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("AnN");
		assertEquals("NaA", rot13);
	}

	@Test
	public void skal_finne_rot13_av_en_setning_med_komma_og_utropstegn() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("Hei, du!");
		assertEquals("Urv, qh!", rot13);
	}

	@Test
	public void skal_finne_rot13_av_programming_motherfucker() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("Programming, motherfucker");
		assertEquals("Cebtenzzvat, zbgureshpxre", rot13);
	}

	@Test
	public void skal_finne_rot13_av_steria_open() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("Steria Open");
		assertEquals("Fgrevn Bcra", rot13);
	}

	@Test
	public void skal_finne_rot13_av_zed_shaw() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("Zed Shaw");
		assertEquals("Mrq Funj", rot13);
	}
	@Test
	public void skal_finne_rot13_av_setning_med_ø_æ_å() {
		Oppgave5 opg = new Oppgave5();
		String rot13 = opg.finnRot13("Jæi øver på å si æææ");
		assertEquals("Wæv øire cå å fv æææ", rot13);
	}

}

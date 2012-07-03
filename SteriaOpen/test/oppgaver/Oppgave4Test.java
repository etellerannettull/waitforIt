package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Oppgave4Test {

	@Test
	public void skal_finne_0_flokker_i_tomt_bilde() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {{}});
		assertEquals('0', flokker);
	}

	@Test
	public void skal_finne_0_flokker_i_bilde() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {
													"adqwer".toCharArray(),
													"qwerty".toCharArray(),
													"zxcvbn".toCharArray()
													});
		assertEquals('0', flokker);
	}

	@Test
	public void skal_finne_0_flokker_i_bilde_2() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {
				"Sdqwer".toCharArray(),
				"aScrty".toCharArray(),
				"zxSvbn".toCharArray()
		});
		assertEquals('0', flokker);
	}
	
	@Test
	public void skal_finne_1_flokk_i_bilde() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {
													"adqwer".toCharArray(),
													"SSSrty".toCharArray(),
													"zxcvbn".toCharArray()
													});
		assertEquals('1', flokker);
	}

	@Test
	public void skal_finne_1_flokk_i_bilde_2() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {
													"adSwer".toCharArray(),
													"qwSrty".toCharArray(),
													"zxSvbn".toCharArray()
													});
		assertEquals('1', flokker);
	}

	@Test
	public void skal_finne_1_flokk_i_bilde_3() {
		Oppgave4 opg = new Oppgave4();
		char flokker = opg.tellFlokker(new char[][] {
													"adSwer".toCharArray(),
													"qSSrty".toCharArray(),
													"zxxvbn".toCharArray()
													});
		assertEquals('1', flokker);
	}

}

package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Oppgave7Test {

	@Test
	public void skal_returnere_palindrom_tom() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("12344321");
		assertEquals("TACOCAT", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_12321() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("123421");
		assertEquals("2", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_12345321() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("12345321");
		assertEquals("3", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_12531() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("12531");
		assertEquals("1", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_12521() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("12521");
		assertEquals("TACOCAT", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_41587514() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("41587514");
		assertEquals("3", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_97144179() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("97144179");
		assertEquals("TACOCAT", palindrom);
	}

	@Test
	public void skal_finne_antall_tall_som_er_palindrom_for_93144179() {
		Oppgave7 opg = new Oppgave7();
		String palindrom = opg.finnPalindrom("93144179");
		assertEquals("3", palindrom);
	}

}

package oppgaver;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class Oppgave3Test {

	@Test
	public void skal_legge_summere_to_tall() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(100), new BigDecimal(200));
		assertEquals(new BigDecimal(300), sum);
	}

	@Test
	public void skal_legge_summere_fire_tall() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(100), new BigDecimal(200), new BigDecimal(300), new BigDecimal(400));
		assertEquals(new BigDecimal(1000), sum);
	}

	@Test
	public void skal_ikke_summere_med_negative_tall() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(-100));
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void skal_summere_eksempel_1() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(100000), new BigDecimal(200000), new BigDecimal(300000));
		assertEquals(new BigDecimal(600000), sum);
	}

	@Test
	public void skal_summere_eksempel_2() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(-30000), new BigDecimal(20000));
		assertEquals(new BigDecimal(20000), sum);
	}

}

package oppgaver;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

public class Oppgave3Test {

	@Test
	@Ignore
	public void skal_legge_summere_to_tall() {
		Oppgave3 opg = new Oppgave3();
		BigDecimal sum = opg.summer(new BigDecimal(100), new BigDecimal(200));
		assertEquals(new BigDecimal(300), sum);
	}

}

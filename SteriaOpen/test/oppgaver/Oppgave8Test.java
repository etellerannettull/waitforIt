package oppgaver;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Oppgave8Test {
	
	@Test
	public void skal_finne_bonus_etter_1_år() {
		Oppgave8 opg = new Oppgave8();
		BigInteger bonus = opg.finnBonus(1);
		assertEquals(BigInteger.ZERO, bonus);
	}

	@Test
	public void skal_finne_bonus_etter_2_år() {
		Oppgave8 opg = new Oppgave8();
		BigInteger bonus = opg.finnBonus(2);
		assertEquals(new BigInteger("1000"), bonus);
	}

	@Test
	public void skal_finne_bonus_etter_3_år() {
		Oppgave8 opg = new Oppgave8();
		BigInteger bonus = opg.finnBonus(3);
		assertEquals(new BigInteger("2000"), bonus);
	}

	@Test
	public void skal_finne_bonus_etter_5_år() {
		Oppgave8 opg = new Oppgave8();
		BigInteger bonus = opg.finnBonus(5);
		assertEquals(new BigInteger("5000"), bonus);
	}

	@Test
	public void skal_finne_bonus_etter_60_år() {
		Oppgave8 opg = new Oppgave8();
		BigInteger bonus = opg.finnBonus(60);
		assertEquals(new BigInteger("1548008755920000"), bonus);
	}

}

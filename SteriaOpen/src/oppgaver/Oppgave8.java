package oppgaver;

import java.math.BigInteger;

// Bonusmodell
public class Oppgave8 {
	public BigInteger finnBonus(int antallår) {
		if(antallår == 1) return BigInteger.ZERO;
		if(antallår == 2) return new BigInteger("1000");
		
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		
		for (int i = 2; i < antallår; i++) {
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return b.multiply(new BigInteger("1000"));
	}
}

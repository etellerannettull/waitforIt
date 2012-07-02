package oppgaver;

import java.math.BigDecimal;

public class Oppgave3 {

	public BigDecimal summer(BigDecimal... tall) {
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal t : tall) {
			if (t.signum() > 0)
				sum = sum.add(t);
		}

		return sum;
	}

}

package oppgaver;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

public class Oppgave2Test {

	@Test
	public void skal_returnere_omggirlz() {
		Oppgave2 opg = new Oppgave2();
		String svar = opg.finnKjell(new HashMap<String, String>());
		assertEquals("OMGGIRLZ", svar);
	}

	@Test
	@Ignore
	public void skal_finne_kjell_på_topp() throws Exception {
		Map<String, String> kart = new HashMap<>();
		kart.put("Kjell", "Gunnar");

		Oppgave2 opg = new Oppgave2();
		String svar = opg.finnKjell(kart);
		assertEquals("0", svar);
	}

}

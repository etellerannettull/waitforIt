package oppgaver;

//import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class Oppgave1Test {

	@Test
	public void skal_skjønne_hvordan_calendar_fønker() {
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+01:00"));
		cal.set(2012, 10, 30, 3, 2, 3);
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.YYYY HH:mm", Locale.FRENCH);
		System.out.println((sf.format(cal.getTime())));
	}

	@Test
	public void skal_returnere_innsendt_dato_på_riktig_format() {
		Oppgave1 opg = new Oppgave1();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+01:00"));
		cal.set(2012, 10, 30, 3, 0, 0); // måned er 0-basert, så 10 er
										// november........bah...
		String dato = opg.formaterDato(cal.getTime());
		assertEquals("30.11.2012 03:00", dato);
	}

	@Test
	public void skal_returnere_innsendt_sommertidsdato_på_riktig_format() {
		Oppgave1 opg = new Oppgave1();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 30, 3, 0, 0);
		String dato = opg.formaterDato(cal.getTime());
		assertEquals("30.07.2012 03:00", dato);
	}

	@Test
	public void skal_legge_til_tre_timer_på_et_tidspunkt() {
		Oppgave1 opg = new Oppgave1();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 30, 3, 0, 0);
		String dato = opg.leggTilTimer(cal, 3);
		assertEquals("30.07.2012 06:00", dato);
	}

	@Test
	public void skal_legge_til_tre_timer_på_et_tidspunkt_over_midnatt() {
		Oppgave1 opg = new Oppgave1();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 2, 22, 0, 0);
		String dato = opg.leggTilTimer(cal, 3);
		assertEquals("03.07.2012 01:00", dato);
	}
}
package oppgaver;

//import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Ignore;
import org.junit.Test;

public class OleMariusTest {

	@Test
	public void skal_skjønne_hvordan_calendar_fønker() {
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+01:00"));
		cal.set(2012, 10, 30, 3, 2, 3);
		cal.setTimeZone(TimeZone.getTimeZone("GMT+02:00"));

		Calendar annencal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		annencal.set(2012, 10, 30, 3, 2, 3);

		long timer = ((annencal.getTimeInMillis() - cal.getTimeInMillis()) / 1000 / 60 / 60);
		System.out.println(timer);

		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.YYYY HH:mm", Locale.FRENCH);
		System.out.println((sf.format(cal.getTime())));
	}

	@Test
	public void skal_returnere_innsendt_dato_på_riktig_format() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+01:00"));
		cal.set(2012, 10, 30, 3, 0, 0); // måned er 0-basert, så 10 er
										// november........bah...
		String tidspunkt = opg.formaterTidspunkt(cal);
		assertEquals("30.11.2012 03:00", tidspunkt);
	}

	@Test
	public void skal_returnere_innsendt_sommertidsdato_på_riktig_format() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 30, 3, 0, 0);
		String tidspunkt = opg.formaterTidspunkt(cal);
		assertEquals("30.07.2012 03:00", tidspunkt);
	}

	@Test
	public void skal_legge_til_tre_timer_på_et_tidspunkt() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 30, 3, 0, 0);
		opg.leggTilTimer(cal, 3);
		assertEquals("30.07.2012 06:00", opg.formaterTidspunkt(cal));
	}

	@Test
	public void skal_legge_til_tre_timer_på_et_tidspunkt_over_midnatt() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 2, 22, 0, 0);
		opg.leggTilTimer(cal, 27);
		assertEquals("04.07.2012 01:00", opg.formaterTidspunkt(cal));
	}

	@Test
	public void skal_legge_til_ti_timer_på_et_tidspunkt_over_midnatt() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 6, 2, 22, 0, 0);
		opg.leggTilTimer(cal, 10);
		assertEquals("03.07.2012 08:00", opg.formaterTidspunkt(cal));
	}

	@Test
	public void skal_legge_til_tjue_timer_på_et_tidspunkt_over_midnatt() {
		OleMarius opg = new OleMarius();
		Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+02:00"));
		cal.set(2012, 8, 10, 8, 0, 0);
		opg.leggTilTimer(cal, 20);
		assertEquals("11.09.2012 04:00", opg.formaterTidspunkt(cal));
	}

	@Test
	public void skal_finne_ut_når_et_fly_lander_i_samme_tidssone() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 8, 10, 8, 0, "MET", "MET", 4);
		assertEquals("10.08.2012 12:00", tidspunkt);
	}

	@Test
	public void skal_finne_ut_når_et_fly_tar_av_i_tidssone_pluss_tre() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 8, 10, 8, 0, "GMT+03:00", "MET", 4);
		assertEquals("10.08.2012 11:00", tidspunkt);
	}

	@Test
	public void skal_finne_ut_når_et_fly_tar_av_i_tidssone_cst() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 8, 10, 8, 0, "CST", "MET", 4);
		assertEquals("10.08.2012 19:00", tidspunkt);
	}

	@Test
	public void skal_finne_ut_når_et_fly_tar_av_i_tidssone_ist_i_sommertid() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 8, 10, 8, 0, "IST", "MET", 4);
		assertEquals("10.08.2012 08:30", tidspunkt);
	}

	@Test
	public void skal_finne_ut_når_et_fly_tar_av_i_tidssone_ist_i_vintertid() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 11, 10, 8, 0, "IST", "MET", 4);
		assertEquals("10.11.2012 07:30", tidspunkt);
	}

	@Test
	@Ignore
	public void skal_finne_ut_når_et_fly_i_samme_tidssone_lander_i_overgang_til_vintertid() throws Exception {
		OleMarius opg = new OleMarius();
		String tidspunkt = opg.finnTidspunktForLanding(2012, 10, 28, 0, 0, "UTC", "MET", 2);
		assertEquals("28.10.2012 02:00", tidspunkt);
	}
}
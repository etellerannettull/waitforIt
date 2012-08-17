package oppgaver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Oppgave4Test {

	@Test
	public void skal_finne_0_flokker_i_tomt_bilde() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { {} });
		assertEquals(0, flokker);
	}

	@Test
	public void skal_finne_0_flokker_i_bilde() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "adqwer".toCharArray(), "qwerty".toCharArray(), "zxcvbn".toCharArray() });
		assertEquals(0, flokker);
	}

	@Test
	public void skal_finne_0_flokker_i_bilde_2() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "Sdqwer".toCharArray(), "aScrty".toCharArray(), "zxSvbn".toCharArray() });
		assertEquals(0, flokker);
	}

	@Test
	public void skal_finne_1_flokk_i_bilde() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "adqwer".toCharArray(), "SSSrty".toCharArray(), "zxcvbn".toCharArray() });
		assertEquals(1, flokker);
	}

	@Test
	public void skal_finne_1_flokk_i_bilde_2() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "adSwer".toCharArray(), "qwSrty".toCharArray(), "zxSvbn".toCharArray() });
		assertEquals(1, flokker);
	}

	@Test
	public void skal_finne_1_flokk_i_bilde_3() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "adSwer".toCharArray(), "qSSrty".toCharArray(), "zxxvbn".toCharArray() });
		assertEquals(1, flokker);
	}

	@Test
	public void skal_finne_flokker_testdata2() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { "WSSSWS".toCharArray(), "ASDSAW".toCharArray(), "RSSSSA".toCharArray(), "POIUAW".toCharArray(),
				"SOIASW".toCharArray(), "SOISSW".toCharArray() });
		assertEquals(2, flokker);
	}

	@Test
	public void skal_takle_store_testdata() {
		Oppgave4 opg = new Oppgave4();
		int flokker = opg.tellFlokker(new char[][] { 
				"SSSWWSSSSWSSSWWSSSSWSSSWWSSSSWSSSWWSSSS".toCharArray(),
				"SWJFELFKJLEWASKLFKEWKJFLDSJFLEWKFWKLEWK".toCharArray(), 
				"ASLDJSALJFDOEWASLJFALWJASJFLAJFELQCLDMD".toCharArray(),
				"SKDFKSJDNJKSHFWEFIUREGHKIJKFDKJESFLAKDS".toCharArray(), 
				"SDJVFKEWNJFISJNVKFHRGLIESJFLAJIEWHFKDKE".toCharArray(),
				"DSKJDFNCLAKSJAØFKJOEJFAKSNFDKJGFNHALJEW".toCharArray(), 
				"ASLKJSSSSDJFLAFEJEFJKDKFSSLAJSFJIEWJFKL".toCharArray(),
				"KLKKIJGRGFDIRHEHIEWAQHWHKJSDHAAKHFRLKAS".toCharArray(), 
				"LFKDSAKLJSDKJSSJFDLEJFKKKEJFJFWEFJWEKKF".toCharArray(),
				"BBDSJFWESOJFELSSSHJEFLJSFLKJELJSEIJFLWE".toCharArray(), 
				"LKSDFSIESLKJGFJSLKJGLRHELOWJLRGLEKRGLRE".toCharArray(),
				"LDSLJKSKJJKELSWELKKEJFWJFJEWIEIEIJFWIEW".toCharArray(), 
				"JJJREILGJLREJGLWIRELIFEWIREHFLFEILLFEWJ".toCharArray(),
				"NVNVFLKRENJLKJFLKJFLDJFJRELFELLEWAALJEA".toCharArray(), 
				"AØLASJFLAJSSJLJFSLKJELFJEWLHGLREWLWAAKL".toCharArray(),
				"NVXMDJFNCLSWJDFVJLKAJSKJDLAJAJAIWFSSKSF".toCharArray(), 
				"LKSDJFLWEJFLWEFJLKSDSAAAJFSSKSJFLWEKJSK".toCharArray(),
				"MCBVKDRJLFJELSAKSLAJIFLEWAJFLJWEIGHJFDK".toCharArray(), 
				"SKDJFGLKREJLSKDSSKJEFLSEJIJSLKKSJISELJF".toCharArray(),
				"MXNCKSEJFLSJLSAJSREFSKSSJFELJSLFEKJSEKW".toCharArray(), 
				"IEJFLKEWJKSAJFKSEJLKJFDSLJSJSKDJFSLKJLA".toCharArray(),
				"SSSWWSSSSWSSSWWSSSSWSSSWWSSSSWSSSWWSSSS".toCharArray(), 
				"LSKDJFLKJDFLJKSJLKSJLFEISFLKSSKJEFLISLK".toCharArray(),
				"MXNCBVDJSKSAJFKRHGREKFLOEQØOWØAKLSDKJOE".toCharArray(), 
				"XNCBVKJDSALIJFLAEILRELFJØWQØPAØKDØLSAJF".toCharArray(),
				"ÆØSLDFÅPWEØDSLFÆEPWEKFEWSWHJLKAEKEFHNWS".toCharArray(), 
				"VDSWNDCASNDSKJWAQLSJDKJDALSJDALKSJDJKSS".toCharArray(),
				"CMNVKDJFNSNCDSLDFKJDLKCJLDSJFLFAØLOKFJO".toCharArray(), 
				"NCVSKLDAEWKFQLEIJWFLAKSKMXLSAEFJFHØLAWO".toCharArray(),
				"NVKEWLNVMXSKHGOEPJEOIHFLAKSJFDLAKSJKKSK".toCharArray(), 
				"NNVNJKJDSNCMXMZMJSJZJNCNJJJKWFHHFHLIASS".toCharArray(),
				"NCVMKERTYYELKKSLJFJFKJLSDSKJFJLJSLJRELE".toCharArray(), 
				"NCMJDJXMNCNCJDSJKKSAHJFHFHLSALKJFDSJSLA".toCharArray(),
				"NBCMVXNDFSKDSLKLSJEFLJAJLASJSALJALKDSAØ".toCharArray(), 
				"XMCNVKSDNSKNDLWKEMCSLKMCKCSNMDKLNMCSWJF".toCharArray(),
				"MXNCVKLDSAØPWQIFLKSAFDEKSCKNAKLSFJALKSD".toCharArray(), 
				"SMNDKCNLNSLSSKLDNFSLKENLWFKNSNLEWKLWSSN".toCharArray(),
				"SSSWWSSSSWSSSWWSSSSWSSSWWSSSSWSSSWWSSSS".toCharArray(), 
				"MXCNVSDSLKNDVLKDSNDSNFDKELQJALASSLKJEFE".toCharArray() });
		assertEquals(2, flokker);
	}

}

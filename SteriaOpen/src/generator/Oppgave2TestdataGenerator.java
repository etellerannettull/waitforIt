package generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import oppgaver.Oppgave2;

public class Oppgave2TestdataGenerator {

	private static final String NEW_LINE = "\n";

	// TODO Må fikse implementasjonen så samme person kan være sjef til flere
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Tore", "Kjell");
		map1.put("Gudrun", "Tore");
		map1.put("Nils", "Gudrun");

		Map<String, String> map2 = new HashMap<>();
		map2.put("Bjarte", "Trude");
		map2.put("Trude", "Åge");
		map2.put("Trude", "Tom");
		map2.put("Torbjørn", "Bjarte");

		Map<String, String> map3 = new HashMap<>();
		map3.put("Kjell", "Bjarne");
		map3.put("Bjarne", "Petter");
		map3.put("Magnus", "Kjell");
		map3.put("Kjell", "Knut");
		map3.put("Magnus", "Tore");
		map3.put("Tore", "Guri");

		Map<String, String> map4 = new HashMap<>();
		map4.put("Knut", "Johannes");

		Map<String, String> map5 = new HashMap<>();
		map5.put("Per", "Turid");
		map5.put("Turid", "Kjell");
		map5.put("Per", "Kjell");

		Map<String, String> map6 = new HashMap<>();
		map6.put("Beate", "Ingvild");
		map6.put("Beate", "PerOtto");
		map6.put("Ingvild", "Espen");
		map6.put("Espen", "Kjell");

		Map<String, String> map7 = new HashMap<>();
		map7.put("Line", "Kjell");
		map7.put("Kjell", "Åge");
		map7.put("Trude", "Line");
		map7.put("Line", "Bjarte");
		map7.put("Trude", "Knut");

		Map[] org = { map1, map2, map3, map4, map5, map6, map7 };
		System.out.println(genererInputFil(org));
		System.out.println("----------------------");
		System.out.println(genererOutputFil(org));
	}

	private static String genererOutputFil(Map<String, String>[] org) {
		Oppgave2 opg = new Oppgave2();
		StringBuilder builder = new StringBuilder();

		for (Map<String, String> kart : org) {
			builder.append(opg.finnKjell(kart)).append(NEW_LINE);
		}

		return builder.toString();
	}

	private static String genererInputFil(Map<String, String>[] org) {
		StringBuilder builder = new StringBuilder();

		builder.append(org.length).append(NEW_LINE);
		for (Map<String, String> kart : org) {
			builder.append(kart.size()).append(NEW_LINE);
			for (Entry<String, String> entry : kart.entrySet()) {
				builder.append(entry.getKey()).append(" ").append(entry.getValue()).append(NEW_LINE);
			}
		}

		return builder.toString();
	}

	// 2 3
	// 3 NOKJELL
	// Tore Kjell
	// Gudrun Tore
	// Nils Gudrun
	// 4
	// Bjarte Trude
	// Trude Åge
	// Trude Tom
	// Torbjørn Bjarte

}

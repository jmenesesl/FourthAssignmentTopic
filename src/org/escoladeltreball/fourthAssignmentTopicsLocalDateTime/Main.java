/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * Explicacion Paths y Files java 8 en el file itv: id es long, lo demás es
		 * cadena
		 */
		// List<String> records = Files.readAllLines(Paths.get("itv"));
		// System.out.println(records);
		//
		// List<ITV> itvs = new ArrayList<>();
		//
		// for(String record: records) {
		// String[] fields = record.split(",");
		// long id = Long.parseLong(fields[0]);
		// ITV itv = new ITV(id, fields[1], fields[2], fields[3], fields[4]);
		// itvs.add(itv);
		// }
		// System.out.println(itvs);
		//
		//// Collections.sort(itvs); // Necesita saber por que campo ordenar implements
		// Comparable
		// Collections.sort(itvs);
		// System.out.println(itvs);

		ITVManagerImpl manager = new ITVManagerImpl("itvLocalDateTime");
		System.out.println(LocalDateTime.now());

		LocalDateTime now = LocalDateTime.now();
		System.out.println(manager.getNext());

		System.out.println("Vamos a comparar matriculas: \n");
		String matricula1 = "3408hcp";
		String matricula2 = "3408jcp";

		System.out.println(matricula2.compareTo(matricula1));

		List<ITVLocalDateTime> itvsFromWhere = manager.from("barcelona");

		for (ITVLocalDateTime itv : itvsFromWhere) {
			System.out.println(itv.toString());
		}
		
		System.out.println("\n ITVS entre el 1 de octubre y el 31 de octubre\n\n");
		
		LocalDateTime ini = LocalDateTime.parse("01/10/2017 00:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime fin = LocalDateTime.parse("31/10/2017 00:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

		List<ITVLocalDateTime> itvsFromDate = manager.from(ini, fin);

		for (ITVLocalDateTime itv : itvsFromDate) {
			System.out.println(itv.toString());
		}
	}

}

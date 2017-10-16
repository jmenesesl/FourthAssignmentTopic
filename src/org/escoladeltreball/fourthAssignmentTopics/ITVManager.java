/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopics;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public abstract class ITVManager implements Manager {

	protected List<ITV> itvs;

	/**
	 * 
	 */
	public ITVManager(String itvFile) throws Exception {
		setup(itvFile);
	}

	private void setup(String itvFile) throws Exception {

		List<String> records = Files.readAllLines(Paths.get(itvFile));
		// System.out.println(records);

		List<ITV> itvs = new ArrayList<>();

		for (String record : records) {
			String[] fields = record.split(",");
			long id = Long.parseLong(fields[0]);
//			ITV itv = new ITV(id, fields[1], LocalDateTime.parse(fields[2], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), fields[3]);
			ITV itv = new ITV(id, fields[1], LocalDate.parse(fields[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalTime.parse(fields[3]), fields[4]);
			itvs.add(itv);
		}
	}

}

/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public abstract class ITVManager implements Manager {

	protected List<ITVLocalDateTime> itvs;

	/**
	 * 
	 */
	public ITVManager(String itvFile) throws Exception {
		setup(itvFile);
	}

	private void setup(String itvFile) throws Exception {

		List<String> records = Files.readAllLines(Paths.get(itvFile));
		List<ITVLocalDateTime> itvs = new ArrayList<>();

		for (String record : records) {
			String[] fields = record.split(",");
			long id = Long.parseLong(fields[0]);
			ITVLocalDateTime itv = new ITVLocalDateTime(id, fields[1], LocalDateTime.parse(fields[2], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), fields[3]);
			itvs.add(itv);
		}
	}

}

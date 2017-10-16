/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public class ITVManagerImpl extends ITVManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ITVManagerImpl(String itvFile) throws Exception {
		super(itvFile);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.fourthAssignmentTopics.Manager#getNext()
	 */
	@Override
	public ITVLocalDateTime getNext() throws Exception {
		// Explicacion de local date y local time
		ITVLocalDateTime next = null;
		if (itvs != null) {
			next = itvs.get(0);
			for (int i = 1; i < itvs.size(); i++) {
				if (itvs.get(i).getDate().isBefore(next.getDate())
						&& itvs.get(i).getDate().isAfter(LocalDateTime.now())) {
					next = itvs.get(i);
				}
			}
		}

		// for (ITVLocalDateTime itv : itvs) {
		// System.out.println(itv.getPlate());
		// }

		return next;
	}
}

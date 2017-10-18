/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		// ITVLocalDateTime next = null;
		// if (itvs != null) {
		// next = itvs.get(0);
		// for (int i = 1; i < itvs.size(); i++) {
		// if (itvs.get(i).getDate().isBefore(next.getDate())
		// && itvs.get(i).getDate().isAfter(LocalDateTime.now())) {
		// next = itvs.get(i);
		// }
		// }
		// }
		//
		// // for (ITVLocalDateTime itv : itvs) {
		// // System.out.println(itv.getPlate());
		// // }
		//
		// return next;
		LocalDateTime now = LocalDateTime.now();
		List<ITVLocalDateTime> itvsSortedByDate = sort(new ITVDateComparator());
		for (ITVLocalDateTime itv : itvsSortedByDate) {
			if (now.isBefore(itv.getDate())) {
				return itv;
			}
		}
		return null;
	}

	@Override
	public List<ITVLocalDateTime> sort(Comparator<ITVLocalDateTime> comparator) throws Exception {
		List<ITVLocalDateTime> itvsSorted = new ArrayList<>(itvs);
		Collections.sort(itvsSorted, comparator);
		return itvsSorted;
	}

	@Override
	public List<ITVLocalDateTime> from(String where) throws Exception {
		List<ITVLocalDateTime> orderByFrom = new ArrayList<>();
		for (ITVLocalDateTime itv : itvs) {
			if(itv.getWhere().equals(where)) {
				orderByFrom.add(itv);
			}
		}
//		orderByFrom = new ArrayList<>(itvs);
//		orderByFrom.sort(new ITVWhereComparator());
		return orderByFrom;
	}

	@Override
	public List<ITVLocalDateTime> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		List<ITVLocalDateTime> itvsFromDates = new ArrayList<>();
		for (ITVLocalDateTime itv : itvs) {
			if (itv.getDate().isBefore(fin) && itv.getDate().isAfter(ini)) {
				itvsFromDates.add(itv);
			}
		}
		return itvsFromDates;
	}

	// @Override
	// public List<ITVLocalDateTime> from(String where) throws Exception {
	// List<ITVLocalDateTime> ret = itvs.stream().filter(itv ->
	// itv.getWhere().equals(where));
	// return ret;
	// }

}

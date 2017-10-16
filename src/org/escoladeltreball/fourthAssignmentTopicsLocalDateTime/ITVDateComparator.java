/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.util.Comparator;

/**
 * @author iaw26068632
 *
 */
public class ITVDateComparator implements Comparator<ITVLocalDateTime> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITVLocalDateTime itv1, ITVLocalDateTime itv2) {
		// TODO Auto-generated method stub
		return itv1.getDate().compareTo(itv2.getDate());
	}

}

/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.util.Comparator;

/**
 * @author iaw26068632
 *
 */
public class ITVPlateComparator implements Comparator<ITVLocalDateTime> {

	/**
	 * 
	 */
	public ITVPlateComparator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITVLocalDateTime itv1, ITVLocalDateTime itv2) {
		// TODO Auto-generated method stub
		return itv1.getPlate().compareTo(itv2.getPlate());
		
		// FER DOS COMPARADORES MES, PER DATETIME y WHERE
	}

}

/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopics;

import java.util.Comparator;

/**
 * @author iaw26068632
 *
 */
public class ITVPlateComparator implements Comparator<ITV> {

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
	public int compare(ITV itv1, ITV itv2) {
		// TODO Auto-generated method stub
		return itv1.getPlate().compareTo(itv2.getPlate());
		
		// FER DOS COMPARADORES MES, PER DATETIME y WHERE
	}

}

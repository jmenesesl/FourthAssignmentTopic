/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;


import java.time.LocalDateTime;

/**
 * @author iaw26068632
 *
 */
public class ITVLocalDateTime implements Comparable<ITVLocalDateTime> {

	private long id;
	private String plate;
	private LocalDateTime date;
	private String where;
	

	/**
	 * @param id
	 * @param plate
	 * @param date

	 * @param where
	 */
	public ITVLocalDateTime(long id, String plate, LocalDateTime date, String where) {
		this.id = id;
		this.plate = plate;
		this.date = date;
		this.where = where;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ITVLocalDateTime other = (ITVLocalDateTime) obj;
		if (id != other.id)
			return false;
		return true;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * @param where the where to set
	 */
	public void setWhere(String where) {
		this.where = where;
	}

	// ************************** ComparableTo ******************
	/**
	 * negatiu si el id d'aquesta itv es mes petit que l'id de itv
	 * 0 si son iguals
	 * positiu si el id d'aquesta itv es mes gran que l'id de itv
	 */


	@Override
	public int compareTo(ITVLocalDateTime o) {
		return (int) (id - o.id);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ITVLocalDateTime [id=%s, plate=%s, date=%s, where=%s]", id, plate, date, where);
	}

}
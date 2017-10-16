/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

/**
 * @author iaw26068632
 *
 */
public interface Manager {

	/**
	 * retorna el seguent vehicle en funcio de la data i hora del sistema
	 * @return
	 * @throws Exception
	 */
	public abstract ITVLocalDateTime getNext() throws Exception;
	
	/**
	 * this method returns a sorted list according to a comparator expression
	 * 
	 * @param comparator the sorting expression
	 * @return a sorted list according to a comparator expression
	 * @throws Exception when is null
	 */
	public abstract List<ITVLocalDateTime> sort(Comparator<ITVLocalDateTime> comparator) throws Exception;
	

	/**
	 * this method returns a list of ITV's from where
	 * @param where the place
	 * @return a list of ITV's from where
	 * @throws Exception when where is null
	 */
	public abstract List<ITVLocalDateTime> from(String where) throws Exception;
	
	/**
	 * this method returns a list of ITVS ranging from init to fin
	 * @param ini Initial Date
	 * @param fin Final date
	 * @return A list with ITV's in the range
	 * @throws Exception when empty
	 */
	public abstract List<ITVLocalDateTime> from(LocalDateTime ini, LocalDateTime fin) throws Exception;
}

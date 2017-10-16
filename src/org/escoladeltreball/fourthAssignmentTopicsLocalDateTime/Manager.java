/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopicsLocalDateTime;

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
}

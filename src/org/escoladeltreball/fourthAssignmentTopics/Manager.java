/**
 * 
 */
package org.escoladeltreball.fourthAssignmentTopics;

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
	public abstract ITV getNext() throws Exception;
}

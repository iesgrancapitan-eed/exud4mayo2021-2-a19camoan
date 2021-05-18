package pgn.exUD4;
/**
 * Si la edad es menor a 0
 * @author acm98
 *
 */
public class EdadErroneaException extends Exception {
	/**
	 * 
	 * @param string
	 */
	public EdadErroneaException(String string) {
		super(string);
	}

}

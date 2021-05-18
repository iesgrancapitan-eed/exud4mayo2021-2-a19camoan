package pgn.exUD4;
/** Clase gato. Extiende de mamifero a�adiendo maullar
 * 
 * @author acm98
 *
 */
public class Gato extends Mamifero {
	/** Cadena "Miauuuuuuuuuuuuu"
	 * 
	 */
	private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @throws EdadErroneaException
	 */
	public Gato(String nombre, int edad) throws EdadErroneaException {
		setAge(edad);
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return cadena "Miauuuuuuuuuuuuu". Llama a la constante est�tica MIAUUUUUUUUUUUUU
	 */
	public String maullar() {
		return MIAUUUUUUUUUUUUU;
	}
}

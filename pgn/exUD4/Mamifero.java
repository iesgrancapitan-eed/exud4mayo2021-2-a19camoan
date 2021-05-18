package pgn.exUD4;
/** Superclase mamifero
 * 
 * @author acm98
 *
 */
public class Mamifero {
	/** Edad del mamífero. Entero, debe ser superior a 0
	 * 
	 */
	private int edad;
	/** Nombre del mamífero. Es una cadena
	 * 
	 */
	protected String nombre;
	/** constructor
	 * 
	 */
	public Mamifero() {
		super();
	}
	/** Setter de edad
	 * 
	 * @param edad
	 * @throws EdadErroneaException
	 */
	public void setAge(int edad) throws EdadErroneaException {
		if (edad < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.edad = edad;
	}

	/** getter de edad
	 * 
	 * @return edad
	 */
	public int getEdad() {
		return this.edad;
	}
	/** getter de nombre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

}
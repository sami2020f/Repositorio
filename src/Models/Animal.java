package Models;

/**
 * Clase animal basica atributos, constructor getters and setters,y el to string
 * 
 * @author Sami
 */
public class Animal 
{

	private String nombre;
	

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	@Override
	public String toString() {
		return "Animal [nombre= " + nombre + "]";
	}
	

}

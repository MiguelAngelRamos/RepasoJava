package modificadores;

public class Persona {

	private String nombre;
	private int edad;
	private String genero;
	
	// get y set
	
	/*public Persona(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			System.out.println("Nombre vacio");
		}
		
		this.nombre = nombre;
	} */
	
	/* public Persona() {
		
	}
	*/
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		
		if( edad >= 1) {
			this.edad = edad;
		} else {
			System.out.println("La edad no puede ser negativa");
		}
	
	}

	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}

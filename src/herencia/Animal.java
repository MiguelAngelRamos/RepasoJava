package herencia;

public class Animal {
	
	protected String nombre;
	protected int edad;
	
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	
	public void dormir() {
		System.out.println("Estoy durmiendo");
	}

}

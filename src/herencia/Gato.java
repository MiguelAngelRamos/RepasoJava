package herencia;

public class Gato extends Animal {

	public Gato(String nombre, int edad) {
		super(nombre, edad);

	}
	
	@Override
	public void comer() {
		System.out.println("Estoy comiendo pescadito y soy gatito");
	}

}

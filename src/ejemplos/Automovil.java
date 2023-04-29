package ejemplos;

public class Automovil {
	
	private String marca;
	private String color;
	private int numRuedas; // int = entero 4 Integer o int 
	private int numPuertas; // int sin punto decimal
	private double precio; // 100939.2029

	// Constructor
	public Automovil(String marca, String color, int numRuedas, int numPuertas, double precio) {
		this.marca = marca;
		this.color = color;
		this.numRuedas = numRuedas;
		this.numPuertas = numPuertas;
		this.precio =  precio;
	} // fin de constructor
	
	
	public Automovil(String marca) {
		this.marca = marca;
	}
	
	public Automovil() {
		
	}


	// Métodos
	public void arrancar() {
		System.out.println("El automóvil está arrancando...");
	}
	
	public void acelerar() {
		System.out.println("El automóvil está acelerando...");
	}
	
	public void frenar() {
		System.out.println("El automóvil está frenando...");
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", color=" + color + ", numRuedas=" + numRuedas + ", numPuertas="
				+ numPuertas + ", precio=" + precio + "]";	
		// Automovil [marca=Hyundai, color=Azul, numRuedas=4, numPuertas=4, precio=100000.0]
	}

} // finClaseAutomovil

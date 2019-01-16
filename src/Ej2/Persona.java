package Ej2;

public class Persona {
	private String nombre;
	private boolean sexo;
	private int edad;
	private double altura;
	
	public Persona(String nombre, boolean sexo, int edad, double altura) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.altura = altura;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void mover() {
		System.out.println("La persona de nombre" + nombre + " se esta moviendo");
	}
	
	public void comer(String comida) {
		System.out.println("La persona de nombre " + nombre + " se está comiendo" + comida);
	}
	public void dormir(int numHoras) {
		System.out.println("La persona de nombre" + nombre + " va a dormir" + numHoras + " horas");
	}


	public String getNombre() {
		return nombre;
	}


	public boolean isSexo() {
		return sexo;
	}


	public int getEdad() {
		return edad;
	}


	public double getAltura() {
		return altura;
	}
}

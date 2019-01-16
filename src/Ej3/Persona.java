package Ej3;

public class Persona {
	private String nombre;
	private boolean estaVivo;
	private int edad;
	private double altura;
	
	
	 public void nacer() {
		 edad=0;
		 estaVivo=true;
		 System.out.println("acaba de nacer");
	 }
	 
	 public void crecer() {
		 edad++;
		 altura +=0.3;
		 
	 }
}

package Ej1;

public class Ej1 {

	public static void main(String[] args) {
		int sumaPares = 0;
		int sumaImpares = 0;
		for (int i = 1; i <= 50; i++) {
		if (i%2 == 0) {
		sumaPares = sumaPares + i;
		} else {
		sumaImpares = sumaImpares + i;
		}
		}
		System.out.println("La suma de los pares es " + sumaPares);
		System.out.println("La suma de los impares es " + sumaImpares);

	}

}

package num_fraccionarios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el numerador del primer numero");
		int n1=scan.nextInt();
		System.out.println("Ingrese el denominador del primer numero");
		int n2=scan.nextInt();
		Racional r1 = new Racional(n1,n2);
		System.out.println("Ingrese el numerador del segundo numero");
		int n3=scan.nextInt();
		System.out.println("Ingrese el denominador del segundo numero");
		int n4=scan.nextInt();
		Racional r2 = new Racional(n3,n4);

		Racional suma = r1.suma(r2);
		Racional resta = r1.resta(r2);
		Racional multiplicacion = r1.multiplicacion(r2);
		Racional division = r1.division(r2);

		System.out.print("La suma es: ");
		suma.print();

		System.out.print("La resta es: ");
		resta.print();

		System.out.print("La multiplicación es: ");
		multiplicacion.print();

		System.out.print("La división es: ");
		division.print();

		if (r1.equals(r2)) {
		    System.out.println("Las fracciones son iguales");
		} else if (r1.esMenorQue(r2)) {
		    System.out.println("La fracción " +"1 " + " es menor que la fracción "+"2");
		} else {
		    System.out.println("La fracción " + "1"+ " es mayor que la fracción "+"2" );
		}
	}

}

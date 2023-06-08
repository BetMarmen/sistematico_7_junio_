package num_fraccionarios;

import java.util.Scanner;

public class Racional {
	 private int numerador;
	    private int denominador;

	    public Racional() {
	        numerador = 0;
	        denominador = 1;
	    }

	    public Racional(int numerador, int denominador) {
	        this.numerador = numerador;
	        this.denominador = denominador;
	    }

	    public int getNumerador() {
	        return numerador;
	    }

	    public int getDenominador() {
	        return denominador;
	    }

	    public void leer() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el numerador: ");
	        numerador = sc.nextInt();
	        System.out.print("Introduce el denominador: ");
	        denominador = sc.nextInt();
	    }

	    public Racional suma(Racional r) {
	        int num = numerador * r.denominador + r.numerador * denominador;
	        int den = denominador * r.denominador;
	        return new Racional(num, den);
	    }

	    public Racional resta(Racional r) {
	        int num = numerador * r.denominador - r.numerador * denominador;
	        int den = denominador * r.denominador;
	        return new Racional(num, den);
	    }

	    public Racional multiplicacion(Racional r) {
	        int num = numerador * r.numerador;
	        int den = denominador * r.denominador;
	        return new Racional(num, den);
	    }

	    public Racional division(Racional r) {
	        int num = numerador * r.denominador;
	        int den = denominador * r.numerador;
	        return new Racional(num, den);
	    }

	    public boolean equals(Racional r) {
	        return numerador * r.denominador == r.numerador * denominador;
	    }

	    public boolean esMenorQue(Racional r) {
	        return numerador * r.denominador < r.numerador * denominador;
	    }

	    public boolean esMayorQue(Racional r) {
	        return numerador * r.denominador > r.numerador * denominador;
	    }

	    public Racional copia() {
	        return new Racional(numerador, denominador);
	    }

	    public void print() {
	        System.out.println(numerador + "/" + denominador);
	    }
}

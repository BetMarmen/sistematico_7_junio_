package persona;

import java.util.Scanner;

public class Persona {
	private String nombre,dni,genero;
	private int edad;
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void ingresar() {
		Scanner scan= new Scanner(System.in);
		try {
		System.out.println("Ingrese su nombre:");
		this.nombre=scan.next();
		System.out.println("Ingrese su DNI");
		this.dni=scan.next();
		System.out.println("Ingrese su genero.");
		System.out.println("M/F");
		this.genero=scan.next();
		}
		catch(Exception e) {
			System.out.println("Ingrese lo solicitado");
		}
		try {
			System.out.println("Ingrese su edad:");
			this.edad=scan.nextInt();
		}catch(Exception e) {
			System.out.println("¡Ingrese algo valido!");
		}

	}
	public void mostrar() {
		System.out.println("Datos de la persona");
		System.out.println("Nombre: "+getNombre());
		System.out.println("DNI: "+getDni());
		System.out.println("Edad:"+getEdad());
		if(this.edad>=18 && this.genero.equals("F")) {
			System.out.println("Es mayor de edad!");

		}
		else if(this.edad<18 && this.edad>0 && this.genero.equals("F")){
			System.out.println("Es menor de edad!");
		}
		else if(this.edad>=21 && this.genero.equals("M")) {
			System.out.println("Es mayor de edad!");

		}
		else if(this.edad<21 && this.edad>0 && this.genero.equals("M")){
			System.out.println("Es menor de edad!");
		}

	}
}

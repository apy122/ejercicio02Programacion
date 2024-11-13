package javabeans;

import java.util.Scanner;

public class Fiesta {
	// Atributos
	private String tipoFiesta;
	private String direcccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;

	// Constructor con atributos y vacío
	public Fiesta(String tipoFiesta, String direcccion, int bocadillos, int bebidas, int invitados) {
		this.tipoFiesta = tipoFiesta;
		this.direcccion = direcccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
	}

	public Fiesta() {
		this.tipoFiesta = "Desconocida";
		this.direcccion = "Desconocida";
		this.bocadillos = 0;
		this.bebidas = 0;
		this.invitados = 0;
	}

	// Métodos getter y setter
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDirecccion() {
		return direcccion;
	}

	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	// Método para sumar invitados
	public void invitar(int invitados) {
		this.invitados += invitados;
		System.out.println("Cantidad de invitados actual: " + this.invitados);
	}

	// Método para mostrar el número actual de invitados
	public void mostrarInvitados() {
		System.out.println("Número actual de invitados: " + this.invitados);
	}

	// Método para restar invitados
	public void retirarInvitacion(int invitados) {
		this.invitados -= invitados;
		if (this.invitados < 0) {
			this.invitados = 0; // Aseguramos que no haya un número negativo de invitados
		}
		System.out.println("Cantidad de invitados actual: " + this.invitados);
	}

	// Método para agregar invitados a través de entrada de usuario
	public void agregarInvitaciones() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce número de invitaciones: ");
		int nuevosInvitados = scanner.nextInt();
		this.invitados += nuevosInvitados;
		System.out.println("Cantidad de invitados actual: " + this.invitados);
	}

	// Sobrecarga de agregarInvitaciones para agregar una cantidad específica
	public void agregarInvitaciones(int invitados) {
		this.invitados += invitados;
		System.out.println("Cantidad de invitados después de agregar: " + this.invitados);
	}

	// Modificación de toString para imprimir los detalles de la fiesta
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direcccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + "]";
	}
}

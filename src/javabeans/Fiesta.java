package javabeans;
import java.util.Scanner;
public class Fiesta {
	//Atributos
	private String tipoFiesta;
	private String direcccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	
	//Constructor  con atributos
	public Fiesta(String tipoFiesta, String direcccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direcccion = direcccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
	}
	
	
	//Constructor sin atributos
	public Fiesta() {
		super();
		this.tipoFiesta = "Desconocido";
		this.direcccion = "Desconocida";
		this.bocadillos = 0;
		this.bebidas = 0;
		this.invitados = 0;
		
	
	}
	
	//getter and setter
	public String getTipoFiesta() {
		return tipoFiesta;
	}
	void setTipoFiesta(String tipoFiesta) {
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
	
	//Generamos la modificacion de toString
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direcccion=" + direcccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + "]";
	}
	
	//metodo y sobrecarga de invitar
	public void invitar (int invitados) {
		this.invitados= invitados ++;
		this.invitados= this.invitados+ invitados;
	}
	public void invitar () {
		System.out.println(this.invitados);
	}
	
	//metodo y sobrecarga de retirar invitacion
	public void retirarInvitacion (int invitados) {
		this.invitados= invitados --;
		this.invitados= this.invitados-invitados;
	}
	public void retirarinvitacion () {
		System.out.println(this.invitados);
	}
	
	//metodo y sobrecarga anadir invitacion
	public void invitar() {
		this.invitados= this.invitados++;
	}
	public void invitar(int invitados) {
		invitar();
		this.invitados=this.invitados+invitados;
		System.out.println("cantidad de invitados:"+ invitados);
	}

	public void retirarInvitacion() {
		this.invitados= this.invitados --;
	}
	public void retirarInvitacion(int invitados) {
		retirarInvitacion();
		this.invitados= this.invitados- invitados;
		System.out.println("cantidad de invitados:"+ invitados);
	}

	
	public void agregarInvitaciones() {
	Scanner invitaciones= new Scanner(System.in);
	System.out.println("Introduce numero de invitaciones: ");
	this.invitados= this.invitados+ invitados;
	}
	public void agregarInvitaciones(int invitados) {
		agregarInvitaciones();
		this.invitados= this.invitados+invitados;
		System.out.println("cantidad de invitados:"+ invitados);
		}
}

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
	
	// Modificación de toString para imprimir los detalles de la fiesta
		@Override
		public String toString() {
			return "Fiesta [tipoFiesta=" + tipoFiesta + ", direcccion=" + direcccion + ", bocadillos=" + bocadillos
					+ ", bebidas=" + bebidas + ", invitados=" + invitados + "]";
		}
		
	// Método para sumar invitados y sobrecarga
	public void invitar(int invitados) {
		this.invitados += invitados;
	}
	public void invitar() {
		invitados =+1;
	}

	// Método para restar invitados y sobrecarga
	public void retirarInvitacion(int invitados) {
		if (this.invitados < 0) {
			this.invitados = 0;
		}else
		this.invitados= this.invitados - invitados;
	}
	public void retirarInvitacion() {
			invitados -=1;
			}
	

	// Método para agregar invitados  y sobrecarga
	public void agregarInvitaciones(int nuevosInvitados) {
        if (nuevosInvitados > 0) {
            this.invitados += nuevosInvitados;
        }
    }

    public void agregarInvitaciones() {
        agregarInvitaciones(1);
    }


	
}

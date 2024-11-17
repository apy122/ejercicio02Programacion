package javabeans;

import java.util.Scanner;

public class Fiesta {
	// Atributos
	private String tipoFiesta;
	private String direcccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	
	int PRECIOINVITADO=5;
	int PRECIOBEBIDA=2;
	int PRECIOBOCADILLO=3;
	
	public Fiesta(String tipoFiesta, String direcccion, int bocadillos, int bebidas, int invitados) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direcccion = direcccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
	}
	
	public Fiesta() {
		super();
		this.tipoFiesta = "Desconocido";
		this.direcccion = "Desconocido";
		this.bocadillos = 0;
		this.bebidas = 0;
		this.invitados = 0;
	}
	

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
	
	//Editamos toString
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direcccion=" + direcccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados;
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
    
    //Genera presupuestoTotal por x personas  1bocata/1bebida/1persona
    public int presupuestoPrecioFiesta() {
    	int precioTotal= (invitados*PRECIOINVITADO)+(bebidas*PRECIOBEBIDA)+ (bocadillos*PRECIOBEBIDA);
    	return precioTotal;
    }
}

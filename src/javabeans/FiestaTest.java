package javabeans;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FiestaTest {
	public static void main(String[] args) {
		//Fecha actual
		LocalDateTime fechaActual= LocalDateTime.now();
		
		//Convertimos en String
		DateTimeFormatter Formatter= DateTimeFormatter.ofPattern("HH:mm dd MM yy");
		String dateString= fechaActual.format(Formatter);
		System.out.println("La fecha actual es:"+ dateString);
		
		Fiesta fies1= new Fiesta("Pijamada", "casa", 0, 0, 0);
		
		System.out.println(fies1);
		fies1.invitar(100);
		fies1.retirarInvitacion(60);
		fies1.agregarInvitaciones();
		int total=fies1.presupuestoPrecioFiesta();
		System.out.println(total);
		System.out.println(fies1);
		}
}

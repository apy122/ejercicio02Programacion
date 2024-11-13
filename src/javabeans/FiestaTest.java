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
		
		Fiesta fies1= new Fiesta();
		System.out.println(fies1);
		
		Fiesta fies2= new Fiesta(null, null, 0, 0, 0);
		fies1=fies2;
		
		System.out.println(fies2);
		fies1.invitar(30);
		fies1.retirarInvitacion(20);
		fies1.agregarInvitaciones(20);
		System.out.println(fies1);
		System.out.println(fies2);
		}
}

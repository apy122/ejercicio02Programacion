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
	}
}

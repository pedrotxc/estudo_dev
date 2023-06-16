import java.time.LocalDate;
import java.time.Month;

public class Data {
	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data);
	}
}

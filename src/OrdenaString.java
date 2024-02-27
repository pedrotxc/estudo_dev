import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();

		palavras.add("alura");
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparingInt(String::length));
		
		palavras.forEach(s -> System.out.println(s));
	}
}
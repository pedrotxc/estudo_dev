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
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(System.out::println);
	}
}

class ComparaString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) {
			return 1;
		}
		if(o1.length() < o2.length()) {
			return -1;
		}
		return 0;
	}
	
}
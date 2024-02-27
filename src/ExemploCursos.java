import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Curso {

	String nome;
	Integer alunos;

	public Curso(String nome, Integer alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAlunos() {
		return alunos;
	}

	public void setAlunos(Integer alunos) {
		this.alunos = alunos;
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		Integer mapToInt = cursos.stream()
		.filter(c -> c.getAlunos() > 60)
		.mapToInt(Curso::getAlunos).sum();
		
		System.out.println(mapToInt);

//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.map(Curso::getAlunos)
//		.forEach(System.out::println);;
//		
//		OptionalDouble average = cursos.stream().mapToInt(c -> c.getAlunos()).average();
//		System.out.println(average);
	}
}

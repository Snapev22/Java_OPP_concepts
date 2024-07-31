package ClassesEObjetos.dominio;
public class Aluno {
	private String nome;
	private int idade;
	private int RGM;
	private Curso curso;

	public Aluno() {}

	public Aluno(String nome, int idade, int RGM,Curso curso ) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.RGM = RGM;
		this.curso = curso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setRGM(int rGM) {
		RGM = rGM;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", RGM=" + RGM + ", curso=" + curso.toString() + "]";
	}


}


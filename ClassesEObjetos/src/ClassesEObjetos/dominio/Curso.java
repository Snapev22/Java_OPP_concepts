package ClassesEObjetos.dominio;

public class Curso {
	private String nome;
	private int duracao;

	public Curso() {}

	public Curso(String nome, int duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", duração=" + duracao + " anos ";
	}



}

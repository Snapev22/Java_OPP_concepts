package Exercicio2;

public abstract class Empregado {
	protected String nome;
	protected String cracha;
	
	public Empregado() {}
	
	public Empregado(String nome, String cracha) {
		super();
		this.nome = nome;
		this.cracha = cracha;
	}
	
	public float calculaSalario() {
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}
	
	
}

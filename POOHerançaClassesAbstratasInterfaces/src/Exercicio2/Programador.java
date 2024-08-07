package Exercicio2;

public class Programador extends Empregado {
	private float qtdeHoras;
	private float valorHora;
	
	public Programador() {}

	public Programador(String nome, String cracha, float qtdeHoras, float valorHora) {
		super(nome, cracha);
		this.qtdeHoras = qtdeHoras;
		this.valorHora = valorHora;
	}

	@Override
	public float calculaSalario() {
		float salario = 0;
		salario += this.qtdeHoras * this.valorHora;
		return salario;
	}
	
	
}

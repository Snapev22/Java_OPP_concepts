package Exercicio1EstruturaDeDecisão;

public class Funcionario {
	private int cracha;
	private float salario;
	private String cargo;

	public Funcionario() {	
		this.cargo = "Assistente";
	}

	public Funcionario(int cracha, float salario, String cargo) {
		super();
		this.cracha = cracha;
		this.salario = salario;
		this.cargo = cargo;
	}

	public float calculaAumento(float porcentagem) {
		float aumento = salario * (porcentagem/100);
		return salario += aumento;
	}

	public float calculaAumento(int anosTrabalhados) {
		float aumento = anosTrabalhados * 150.0f;
		return salario += aumento;
	}


	@Override
	public String toString() {
		return "Dados do funcionário: "
				+ "\nCracha: " + cracha
				+ "\nSalario: " + salario
				+ "Cargo: " + cargo;

	}

	public int getCracha() {
		return cracha;
	}

	public void setCracha(int cracha) {
		this.cracha = cracha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


}

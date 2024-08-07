package Exercicio2;

public class Caixa extends Funcionario {

	public Caixa() {
	}

	@Override
	public double bonificacao() {
		double bonificacao;
		bonificacao = this.salario * 1.1;
		return bonificacao;
	}

	@Override
	public String toString() {
		return "Dados do caixa: " + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nSalario: " + this.salario
				+ "\nSalario com bonificação: " + String.format("%.2f", bonificacao());
	}

}

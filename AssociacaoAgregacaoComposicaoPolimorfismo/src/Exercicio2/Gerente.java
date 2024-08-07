package Exercicio2;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	private static final String SENHA = "1234-56";
	private int funcionariosGerenciados;

	public Gerente() {
	}

	public Gerente(String nome, String cpf, double salario, int funcionariosGerenciados) {
		super(nome, cpf, salario);
		this.funcionariosGerenciados = funcionariosGerenciados;
	}

	@Override
	public boolean autenticar() {
		while (true) {
			String verificaSenha = JOptionPane.showInputDialog("Digite a senha: ");
			if (verificaSenha.equals(SENHA)) {
				return true;

			} else {

				int opcoes;
				opcoes = Integer.parseInt(JOptionPane
						.showInputDialog("Senha incorreta, digite um numero abaixo para escolher uma das opções"
								+ "\n1 - tentar novamente: " + "\n2 - Sair"));
				if (opcoes == 2) {
					return false;
				} else if (opcoes != 1) {
					JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
				}
			}
		}
	}

	@Override
	public double bonificacao() {
		double bonificacao;
		bonificacao = this.salario * 1.15;
		return bonificacao;
	}

	@Override
	public String toString() {
		autenticar();
		return "Dados do gerente: " + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nSalario: " + this.salario
				+ "\nSalario com bonificação: " + String.format("%.2f", bonificacao())
				+ "\nNumero de funcionarios gerenciados: " + this.funcionariosGerenciados;
	}

}

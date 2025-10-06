package simuladorDeBonificacao.test;

import javax.swing.JOptionPane;

import simuladorDeBonificacao.Funcionario;
import simuladorDeBonificacao.Gerente;

public class BancoTest01 {

	public static void main(String[] args) {
		
		/*
		 * ENUNCIADO: Simula o cálculo da bonificação de um Gerente.
		 * Demonstra a sobrescrita (Override) do método 'bonificacao()'.
		 */

		String nome = JOptionPane.showInputDialog("Digte o nome: ");

		String cpf = JOptionPane.showInputDialog("Digite o CPF:");

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));

		Funcionario gerente = new Gerente(nome, cpf, salario, 5);

		gerente.bonificacao();

		System.out.println(gerente);
	}

}

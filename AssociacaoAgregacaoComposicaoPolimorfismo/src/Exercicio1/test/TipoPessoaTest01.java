package Exercicio1.test;

import javax.swing.JOptionPane;

import Exercicio1.Aluno;
import Exercicio1.Funcionario;
import Exercicio1.Pessoa;
import Exercicio1.Professor;

public class TipoPessoaTest01 {

	public static void main(String[] args) {
		Pessoa p = null;

		while (true) {
			int tipo = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Digite um dos números para selecionar a opão desejada: "
							+ "\n1 - Aluno" + "\n2 - Professor " + "\n3 - Funcionario" + "\n4 - Sair"));
			switch (tipo) {
			case 1:
				p = new Aluno();
				break;
			case 2:
				p = new Professor();
				break;
			case 3:
				p = new Funcionario();
				break;
			case 4:
				System.out.println("Saiu!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida tente novamente");
				System.exit(0);
			}
			p.cadastraPessoa();
			p.mostraClasse();
		}
	}

}

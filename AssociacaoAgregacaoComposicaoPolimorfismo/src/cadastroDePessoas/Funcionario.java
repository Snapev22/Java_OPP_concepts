package Exercicio1;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	private int matricula;
	private String setor;

	public Funcionario() {
	}

	@Override
	public void cadastraPessoa() {
		super.cadastraPessoa();
		this.setor = JOptionPane.showInputDialog("Digite o setor do funcionário: ");
		this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
	}

	@Override
	public String mostraClasse() {
		String classeSelecionada = "Tipo selecionado Funcionario , dados do funcionário: " + "\nNome: " + this.nome
				+ "\nCPF: " + this.cpf + "\nIdade: " + this.idade + "\nMatricula: " + this.matricula + "\nSetor: "
				+ this.setor;

		JOptionPane.showMessageDialog(null, classeSelecionada);
		return classeSelecionada;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}

package Exercicio1;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	private String rgm;

	public Aluno() {
	}

	@Override
	public void cadastraPessoa() {
		super.cadastraPessoa();
		this.rgm = JOptionPane.showInputDialog("Digite seu RGM: ");

	}

	@Override
	public String mostraClasse() {
		String classeSelecionada = "Tipo selecionado aluno, dados do aluno: " + "\nNome: " + this.nome + "\nCPF: "
				+ this.cpf + "\nIdade: " + this.idade + "\nRGM: " + this.rgm;
		JOptionPane.showMessageDialog(null, classeSelecionada);
		return classeSelecionada;
	}

	public String getRgm() {
		return rgm;
	}

	public void setRgm(String rgm) {
		this.rgm = rgm;
	}

}

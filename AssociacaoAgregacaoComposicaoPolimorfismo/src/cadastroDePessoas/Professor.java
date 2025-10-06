package Exercicio1;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {
	private int matricula;
	private String campus;

	public Professor() {
	}

	@Override
	public void cadastraPessoa() {
		super.cadastraPessoa();
		this.campus = JOptionPane.showInputDialog("Digite o campus: ");
		this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
	}

	@Override
	public String mostraClasse() {
		String classeSelecionada = "Tipo selecionado: Professor, dados do professor: " + "\nNome: " + this.nome
				+ "\nCPF: " + this.cpf + "\nIdade: " + this.idade + "\nMatricula: " + this.matricula + "\nCampus: "
				+ this.campus;

		JOptionPane.showMessageDialog(null, classeSelecionada);
		return classeSelecionada;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		campus = campus;
	}

}

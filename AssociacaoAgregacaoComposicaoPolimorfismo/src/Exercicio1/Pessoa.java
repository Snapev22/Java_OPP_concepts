package Exercicio1;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected int idade;

	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public void cadastraPessoa() {
		this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
		this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite suaa idade: "));
	}

	public String mostraClasse() {
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

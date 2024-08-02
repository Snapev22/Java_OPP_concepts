package ModelosDeMemoriaMetodosExemplos;

import javax.swing.JOptionPane;

public class Paciente {
	private String nome;
	private String rg;
	private String endereco;
	private String telefone;
	private int anoNascimento;
	private String profissao;

	public Paciente() {	}

	public Paciente(String nome, String rg, String endereco, String telefone, int anoNascimento, String profissao) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
		this.anoNascimento = anoNascimento;
		this.profissao = profissao;
	}
	public void cadastraDadosPaciente() {
		this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
		this.rg = JOptionPane.showInputDialog("Digite seu RG: ");
		this.endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
		this.telefone = JOptionPane.showInputDialog("Digite um telefone para contato: ");
		this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
		this.profissao = JOptionPane.showInputDialog("Digite sua profissão: ");
	}
	public int calculaIdade(int anoAtual) {
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		return anoAtual - anoNascimento;
	}

	@Override
	public String toString() {
		return "Dados do paciente: "
				+"\nNome " + nome
				+"\nRG: " + rg
				+"\nEndereco: " + endereco
				+"\nTelefone: " + telefone 
				+"\nAno de nascimento: " + anoNascimento
				+"\nProfissão: " + profissao;
	}
}

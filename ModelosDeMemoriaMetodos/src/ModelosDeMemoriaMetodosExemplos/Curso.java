package ModelosDeMemoriaMetodosExemplos;

import java.util.Scanner;

public class Curso {
	private String nome;
	private int qtdAlunos;
	private String turma;
	private float mensalidade;

	public Curso() {}

	public Curso(String nome, int qtdAlunos, String turma, float mensalidade) {
		super();
		this.nome = nome;
		this.qtdAlunos = qtdAlunos;
		this.turma = turma;
		this.mensalidade = mensalidade;
	}

	public void cadastraCurso() {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do curso: ");
		this.nome = leia.nextLine();

		System.out.println("Digite a quantidade de alunos do curso: ");
		this.qtdAlunos = leia.nextInt();
		leia.nextLine();

		System.out.println("Digite o numero da turma: ");
		this.turma = leia.nextLine();

		System.out.println("Digite a mensalidade do curso: ");
		this.mensalidade = leia.nextFloat();

		leia.close();
	}
	public float calculaTotalMensalidade() {
		return mensalidade * qtdAlunos;
	}

	@Override
	public String toString() {
		return "Dados do curso: " 
				+"\nNome " + nome
				+"\nQuantidade de alunos: " + qtdAlunos
				+"\nTurma: " + turma
				+"\nMensalidade: " + mensalidade
				+"\nTotalMensaldade: " + calculaTotalMensalidade();			
	}

}

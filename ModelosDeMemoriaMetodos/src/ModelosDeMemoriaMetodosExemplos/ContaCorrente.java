package ModelosDeMemoriaMetodosExemplos;

import java.util.Scanner;

public class ContaCorrente {
	private String nome;
	private float saldo;
	private float limite;
	private char tipo;

	public ContaCorrente() {}

	public ContaCorrente(String nome, float saldo, float limite, char tipo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		this.tipo = tipo;
	}

	public ContaCorrente(String nome, float saldo, char tipo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	public void cadastraDados() {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		this.nome = leia.nextLine();
		System.out.print("Digite o saldo: ");
		this.saldo = leia.nextFloat();
		System.out.print("Digite o limite: ");
		this.limite = leia.nextFloat();
		System.out.println("Digite o tipo de conta");
		this.tipo = leia.next().charAt(0);
	}

	public void depositar(float valor) {

		if(valor>0) {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso. Novo saldo: " + this.saldo);

		}else {
			System.out.println("Depósito inválido digite um novamente o valor que deseja depositar");
		}	
	}
	public void sacar(float valor) {

		if(valor>0 && (this.saldo + this.limite) >= valor) {
			this.saldo-= valor;
			System.out.println("Saque realizado com sucesso. Novo saldo: " + this.saldo);
		}else {
			System.out.println("Saque inválido digite um novamente o valor que deseja sacarr");
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [nome=" + nome + ", saldo=" + saldo + ", limite=" + limite + ", tipo=" + tipo + "]";
	}


}

package EncapsulamentoEstruturaDeDecisão.test;

import Exercicio1EstruturaDeDecisão.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setCracha(25);
		f1.setSalario(10);
		
		System.out.println(f1);
		System.out.println("--------------------------");
		System.out.println("Novo salário com aumento Percentual: " + f1.calculaAumento(15.0f));
		System.out.println("--------------------------");
		f1.calculaAumento(2);
		System.out.println("Novo salário com aumento por anos trabalhados: " + f1.getSalario());

	}
}

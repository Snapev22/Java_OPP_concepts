package Exercicio2.test;

import Exercicio2.Caixa;
import Exercicio2.Funcionario;

public class BancoTest02 {
	public static void main(String[] args) {
		Funcionario caixa = new Caixa();

		caixa.setNome("Hisoka");
		caixa.setCpf("111-222-333-4");
		caixa.setSalario(1500);
		caixa.bonificacao();

		System.out.println(caixa);
	}
}

package EncapsulamentoEstruturaDeDecisão.test;

import Exercicio1EstruturaDeDecisão.Vendedor;

public class VendedorTest01 {
	public static void main(String [] args) {
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor("Killua", 2, 2000,3000 );
		
		v1.setNome("Killua");
		v1.setSalario(1500);
		v1.setValVendas(1000);
		v1.setNumFaltas(0);
		v1.calculaComissao();
		v1.descontoSobreFalta();
		
		
		v2.calculaComissao();
		v2.descontoSobreFalta();
		
		
		System.out.println(v1);
		v1.calculaSalario();
		System.out.println("----------------------");
		System.out.println(v2);
		v2.calculaSalario();
		
	}
}

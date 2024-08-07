package EncapsulamentoEstruturaDeDecisão.test;

import Exercicio2EstruturaDeDecisão.Competidor;

public class CompetidorTest {

	public static void main(String[] args) {
		Competidor c1 = new Competidor();
		Competidor c2 = new Competidor("Sasuke", 15);
		
		c1.setNome("Goku");
		c1.setIdade(60);
		
		System.out.println(c1);
		System.out.println("Categoria do competidor: " + c1.verificaCategoria(c1.getIdade()));
		System.out.println("--------");
		System.out.println("Categoria do competidor: " + c2.verificaCategoria(c2.getIdade()));
	}

}
  
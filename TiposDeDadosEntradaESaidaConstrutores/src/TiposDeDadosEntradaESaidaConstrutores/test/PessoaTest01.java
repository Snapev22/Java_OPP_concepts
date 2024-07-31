package TiposDeDadosEntradaESaidaConstrutores.test;
import java.util.Scanner;

import TiposDedados.dominio.Pessoa;

public class PessoaTest01 {
	public static void main(String[] args) {
		// exemplo de criação de objeto usando construtores com e sem parâmetros
		Pessoa pessoa1 = new Pessoa("Hisoka", "554.555.555-5", "Rua Número 1", "11222-333", "25/05/2005", "Lutador");
		Pessoa pessoa2 = new Pessoa();		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		pessoa2.setNome(leia.nextLine());
		System.out.print("Digite o seu RG: ");
		pessoa2.setRg(leia.nextLine());	
		System.out.print("Digite o seu endereço: ");
		pessoa2.setEndereco(leia.nextLine());
		System.out.print("Digite o seu telefone: ");
		pessoa2.setTelefone(leia.nextLine());
		System.out.print("Digite a sua data de nascimento: ");
		pessoa2.setDtNascimento(leia.nextLine());
		System.out.print("Digite a sua profissão: ");
		pessoa2.setProfissao(leia.nextLine());

		leia.close();	
		
		System.out.println(pessoa1);
		System.out.println("-------------------");
		System.out.println(pessoa2);
	}
}
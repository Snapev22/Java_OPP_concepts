package ModelosDeMemoriaMetodos.Test;

import ModelosDeMemoriaMetodosExemplos.ContaCorrente;

public class ContaCorrenteTest01 {
	public static void main(String  args[]) {
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente("v", 10, 10, 'c');
		
		conta1.cadastraDados();
		conta1.depositar(20);
		conta1.sacar(20);
		
		conta2.depositar(10);
		conta2.sacar(15);
		
	
		
		System.out.println(conta1);
		System.out.println("--------------------------");
		System.out.println(conta2);
		
	}
}

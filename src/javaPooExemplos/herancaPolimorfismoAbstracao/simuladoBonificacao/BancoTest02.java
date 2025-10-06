package javaPooExemplos.herancaPolimorfismoAbstracao.simuladoBonificacao;

public class BancoTest02 {
	
	/*
	 * ENUNCIADO: Simula o cálculo da bonificação de um Caixa.
	 * Continuação da demonstração de Sobrescrita de métodos.
	 */
	public static void main(String[] args) {
		Funcionario caixa = new Caixa();

		caixa.setNome("Hisoka");
		caixa.setCpf("111-222-333-4");
		caixa.setSalario(1500);
		caixa.bonificacao();

		System.out.println(caixa);
	}
}

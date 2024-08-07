package HerançaClassesAbstratasEstruturaDeRepeticao.test;

import javax.swing.JOptionPane;

import Exercicio2.Analista;
import Exercicio2.Programador;



public class EmpregadoTest01 {
	public static void main(String [] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do analista: ");
		
		String cracha =JOptionPane.showInputDialog("Digite o código do cracha do analista: ");
		
		int numProjetos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de projetos realizados: "));
		
		float[] valProjetos = new float [numProjetos];
		
		for(int i = 0; i <numProjetos; i++) {
			valProjetos[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do projeto"));
		}
		
		Analista analista = new Analista(nome, cracha, valProjetos);
		Programador programador = new Programador("Netero", "111-222-333",44 , 43.08f);
		
		JOptionPane.showMessageDialog(null, 
				"Dados do analista:  " 
				+"\nNome: " + analista.getNome() 
				+"\nCracha: " + analista.getCracha()
				+"\nSalário: " + analista.calculaSalario());
		
		JOptionPane.showMessageDialog(null, 
				"Dados do programador:  " 
				+"\nNome: " + programador.getNome() 
				+"\nCracha: " + programador.getCracha()
				+"\nSalário: " + programador.calculaSalario());
	}
}

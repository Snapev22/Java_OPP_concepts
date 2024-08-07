package HerançaClassesAbstratasEstruturaDeRepeticao.test;
import  javax.swing.JOptionPane;

import Exercicio1.Circunferencia;
import Exercicio1.Retangulo;

public class FormaTest02 {

	public static void main(String[] args) {
		//preenchendo atributos com dados do teclado
		Circunferencia c1 = new Circunferencia();
		Retangulo r1 = new Retangulo();
		
		c1.setRaio (Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do raio: ")));
		c1.calculaArea();
		c1.calculaPerimetro();
		
		r1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retângulo: ")));
		r1.setBase(Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retaângulo: " )));
		r1.calculaArea();
		r1.calculaPerimetro();
		
		c1.mostra();
		System.out.println("-------------------");
		r1.mostra();
	}

}

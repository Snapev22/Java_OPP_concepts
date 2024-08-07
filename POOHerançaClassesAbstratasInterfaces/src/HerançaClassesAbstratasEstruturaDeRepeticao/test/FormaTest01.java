package HerançaClassesAbstratasEstruturaDeRepeticao.test;

import Exercicio1.Circunferencia;
import Exercicio1.Retangulo;
import Exercicio1.Triangulo;

public class FormaTest01 {

	public static void main(String[] args) {
		Circunferencia circ1 = new Circunferencia(5);
		Triangulo tri1 = new Triangulo(5,5);
		Retangulo ret1 = new Retangulo(10, 10);
		
		circ1.calculaPerimetro();
		circ1.calculaArea();
		
		tri1.calculaArea();
		tri1.calculaPerimetro();
		
		ret1.calculaArea();
		ret1.calculaPerimetro();
		
		circ1.mostra();
		System.out.println("-----------------");
		tri1.mostra();
		System.out.println("-----------------");
		ret1.mostra();

	}

}

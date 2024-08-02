package ModelosDeMemoriaMetodos.Test;
import java.util.Scanner;

import ModelosDeMemoriaMetodosExemplos.Triangulo;
public class TrianguloTest01 {
	public static void main(String [] args) {
		Triangulo triangulo1 = new Triangulo(5, 5);
		Triangulo triangulo2 = new Triangulo();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a base do triângulo: ");
		triangulo2.setBase(leia.nextFloat());
		System.out.print("Digite a altura do triângulo: ");
		triangulo2.setAltura(leia.nextFloat());
		leia.close();
		
		triangulo1.calculaArea();
		triangulo2.calculaArea();
		
		System.out.println(triangulo1);
		System.out.println(triangulo2);
		
	}
}

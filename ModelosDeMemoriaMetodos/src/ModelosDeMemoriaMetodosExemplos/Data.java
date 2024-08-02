package ModelosDeMemoriaMetodosExemplos;
import java.util.Scanner;
public class Data {
	private int dia;
	private int mes; 
	private int ano;

	public Data() {

	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void cadastraDados() {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		this.dia = leia.nextInt();
		System.out.print("Digite o mês: ");
		this.mes = leia.nextInt();
		System.out.print("Digite o ano: ");
		this.ano = leia.nextInt();	
	}

	@Override
	public String toString() {
		return "Data: " + dia +"/"+mes+"/"+ano;
	}

}

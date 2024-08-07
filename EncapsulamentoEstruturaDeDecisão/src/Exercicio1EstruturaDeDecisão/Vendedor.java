package Exercicio1EstruturaDeDecisão;

public class Vendedor {
	private String nome;
	private int numFaltas;
	private float salario;
	private float valVendas;

	public Vendedor() {}

	public Vendedor(String nome, int numFaltas, float salario, float valVendas) {
		super();
		this.nome = nome;
		this.numFaltas = numFaltas;
		this.salario = salario;
		this.valVendas = valVendas;
	}

	public float calculaComissao() {
		float comissao = 0;
		if(valVendas >=1000 && valVendas <=2000) {
			comissao +=valVendas * 1.10f;
			return  comissao;
		}else if(valVendas >2000) {
			comissao += valVendas * 1.15f;
			return  comissao;
		}else {
			System.out.println("Valor insuficiente para ganho de comissão.");
			return 0;
		}
	}
	public float descontoSobreFalta() {
		float desconto =0;
		desconto = (this.salario/30) * this.numFaltas;
		return desconto;
	}

	public void calculaSalario() {
		this.salario = (this.salario +  calculaComissao() - descontoSobreFalta());
		System.out.println("salario do funcionario:  " + this.salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumFaltas() {
		return numFaltas;
	}

	public void setNumFaltas(int numFaltas) {
		this.numFaltas = numFaltas;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getValVendas() {
		return valVendas;
	}

	public void setValVendas(float valVendas) {
		this.valVendas = valVendas;
	}

	@Override
	public String toString() {
		return "Dados do vendedor: " 
				+"\nNome: " + nome
				+"\nNumero de faltas do funcionário: " + numFaltas
				+"\nComissão recebida: " + calculaComissao()
				+"\nDesconto sobre faltas" + descontoSobreFalta();
	}

}

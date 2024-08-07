package Exercicio2EstruturaDeDecisão;

public class Competidor {
	private String nome;
	private int idade;

	public Competidor() {}

	public Competidor(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String verificaCategoria(int idade) {
		if(idade <5) {
			return "Idade inválidade, digite novamente";
		}else if(idade >=5 && idade <=7) {
			return "Categoria infantil";
		}else if(idade >=8 && idade <=10){
			return "Categoria Juvenil";
		}else if(idade >=11 && idade <=15) {
			return "Categoria Adolescente";
		}else if(idade >=16 && idade <=30) {
			return "Categoria Adulto";
		}else {
			return "Categoria Senior";
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Dados do competidor cadastrado:"
				+ "\nNome: " + nome
				+ "\nIdade: " + idade;
	}

}


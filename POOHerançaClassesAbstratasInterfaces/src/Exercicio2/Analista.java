package Exercicio2;


public class Analista extends Empregado{
	private float valProjetos [];

	public Analista() {}

	public Analista(String nome, String cracha, float[] valProjeto) {
		super(nome, cracha);
		this.valProjetos = valProjeto;
	}

	@Override
	public float calculaSalario() {
		float salario = 0;
		for(float valor : this.valProjetos) {
			 salario += valor;
		}
		return salario;
		
	}

	public float[] getValProjetos() {
		return valProjetos;
	}

	public void setValProjetos(float[] valProjetos) {
		this.valProjetos = valProjetos;
	}

	@Override
	public String getCracha() {
		// TODO Auto-generated method stub
		return super.getCracha();
	}
	
}

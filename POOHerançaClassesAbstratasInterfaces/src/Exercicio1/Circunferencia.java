package Exercicio1;

public class Circunferencia extends Forma{
	public float raio;
	
	public  Circunferencia(float raio) {	
		this.raio = raio;
	}
	
	
	
	public Circunferencia() {}



	

	public float getRaio() {
		return raio;
	}



	public void setRaio(float raio) {
		this.raio = raio;
	}



	@Override
	public float calculaArea() {
		float area= 0;
		area += (float)Math.PI * (this.raio* this.raio);
		return area;
	}
	
	@Override
	public float calculaPerimetro() {
		float perimetro = 0;
		perimetro += 2* (float)Math.PI * this.raio;
		return perimetro;
	}


	@Override
	public void mostra() {
		System.out.println("Raio da circunferência " + this.raio); 
		System.out.printf("Area da circunferência: %.2f%n",calculaArea());
		System.out.printf("Perimentro da circunferência: %.2f%n ", calculaPerimetro());
		
	}


}

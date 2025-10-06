package calculoGeometrico;

public class Retangulo extends Triangulo {

	public Retangulo() {}
	
	public Retangulo(float base, float altura){
		super(base, altura);
	}
	
	@Override
	public float calculaArea() {
		return super.calculaArea();
	}
	
	@Override
	public float calculaPerimetro() {
		return super.calculaPerimetro();
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
	}



	public void setBase(float base) {
		this.base = base;
	}
	
	
	
	@Override
	public void mostra() {
		System.out.println("Base do retângulo " + this.base); 
		System.out.println("Altura do retângulo " + this.altura); 
		System.out.printf("Area do retângulo: %.2f%n",calculaArea());
		System.out.printf("Perimentro do retângulo: %.2f%n ", calculaPerimetro());
		;
	}

}

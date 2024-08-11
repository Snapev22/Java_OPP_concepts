package ExercicioFormas;

public class Triangulo extends Forma{

	protected float base;
	protected float altura;

	public Triangulo() {}

	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calculaArea() {
		float area = 0;
		area += this.base * this.altura;
		return area;
	}



	@Override
	public float calculaPerimetro() {
		float perimetro = 0;
		perimetro += (this.base*this.altura)/2;
		return perimetro;
	}



	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public void mostra() {
		System.out.println("Base do triângulo " + this.base); 
		System.out.println("Altura do triângulo " + this.altura); 
		System.out.printf("Area do triângulo: %.2f%n",calculaArea());
		System.out.printf("Perimentro do triângulo: %.2f%n ", calculaPerimetro());

	}

}

package ModelosDeMemoriaMetodosExemplos;

public class Triangulo {
	private float base;
	private float altura;

	public Triangulo() {

	}

	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public float calculaArea() {
		float area = (this.base * this.altura)/2;
		return area;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Area do triangulo  = " + calculaArea()  + " ,altura do triangulo = " + altura + ", Base do triangulo = " + base;
	}


}

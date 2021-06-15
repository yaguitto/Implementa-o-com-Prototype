package lab6_POO;

public class Circulo implements Prototype {
	
	private int x;
	private int y;
	private int raio ;
	
	public Circulo(int x, int y, int raio) {
		super();
		this.x = x;
		this.y = y;
		this.raio = raio;
	}

	public Circulo(Circulo source) {
		this.x = source.x;
		this.y = source.y;
		this.raio = source.raio;
	}

	@Override
	public String toString() {
		return "Circulo [x=" + x + ", y=" + y + ", raio=" + raio + "]";
	}

	@Override
	public Prototype clonar() {
		return new Circulo(this);
	}

	
}

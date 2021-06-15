package lab6_POO;

public class Main {

	public static void main(String[] args) {
		
		var c1 = new Circulo(3, 4, 10);
		System.out.println(c1);
		
		var copia = c1.clonar();
		System.out.println(copia);
	}

}

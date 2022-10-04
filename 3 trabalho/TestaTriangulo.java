import java.util.Scanner;
public class TestaTriangulo {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primero lado: ");
			t1.setLado1(entrada.nextDouble());
			
		System.out.println("Segundo lado: ");
			t1.setLado2(entrada.nextDouble());
			
		System.out.println("Terceiro lado: ");
			t1.setLado3(entrada.nextDouble());
	
		
		System.out.println("Seu perimetro: " + t1.perimetro());
		
		System.out.println(t1.verificaTriangulo());
		
	}

}

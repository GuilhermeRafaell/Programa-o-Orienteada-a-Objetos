
public class Triangulo {
	private double lado1, lado2, lado3;
	private double perimetro;
	
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if(lado1<0)
			this.lado1 = 0;
		else
			this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2<0)
			this.lado2 = 0;
		else
			this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if(lado3<=0)	
			this.lado3 = lado3;
	}
	
	public double perimetro() {
		perimetro = getLado1()+getLado2()+getLado3();
		return perimetro;
	}
	
	/*
	public int verificaTriangulo(double lado1, double lado2, double lado3) {
		if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			return 1;
		}
		else if((lado1!=lado2) && (lado1!=lado3) && (lado2!=lado3)) {
			return 2;
		}
		else if((lado1==lado2) && (lado1==lado3) && (lado2!=lado3)) {
			return 3;
		}
		else if((lado1!=lado2) && (lado1==lado3) && (lado2==lado3)) {
			return 3;
		}
		else if((lado1==lado2) && (lado1!=lado3) && (lado2==lado3)) {
			return 3;
		}
	}
	*/
	
	public String verificaTriangulo() {
		if(lado1==lado2 && lado1==lado3) {
			return "Equilatero";
		}else
			if(lado1==lado2 && lado1!=lado3 || lado1==lado3 && lado1!=lado2 || lado2==lado3 && lado2!=lado1) {
				return "Isoceles";
			}else {
				return "Escaleno";
			}
	}
	
		
	
}

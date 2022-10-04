
public class TestaTempo {

	public static void main(String[] args) {
		
		Tempo t = new Tempo(12, 30, 24);
		System.out.println("Horário 1: " + t.getHora() +":"+ t.getMinuto() +":"+ t.getSegundo());
		
		Tempo t1 = new Tempo(12, 30);
		System.out.println("Horário 2: " + t1.getHora() +":"+ t1.getMinuto() +":"+ t1.getSegundo());
		
		Tempo t2 = new Tempo(14);
		System.out.println("Horário 3: " + t2.getHora() +":"+ t2.getMinuto() +":"+ t2.getSegundo());
		
		Tempo t3 = new Tempo(t);
		System.out.println("Horário 4: " + t3.getHora() +":"+ t3.getMinuto() +":"+ t3.getSegundo());
		
		
		t.aumentaMinuto();
		System.out.println("Horário 1 alterado (+1min): " + t.getHora() +":"+ t.getMinuto() +":"+ t.getSegundo());
		
		t1.diminuiMinuto();
		System.out.println("Horário 2 alterado (-1min): " + t1.getHora() +":"+ t1.getMinuto() +":"+ t1.getSegundo());

	}

}

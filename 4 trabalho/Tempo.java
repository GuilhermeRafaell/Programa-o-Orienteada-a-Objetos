public class Tempo {
	private int hora;
	private int minuto;
	private int segundo;

	public Tempo (int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	public Tempo(int hora, int minuto){
		setHora(hora);
		setMinuto(minuto);
		setSegundo(0);
	}
	
	public Tempo(int hora) {
		setHora(hora);
		setMinuto(0);
		setSegundo(0);
	}
	
	public Tempo(Tempo t) {
		setHora(t.hora);
		setMinuto(t.minuto);
		setSegundo(t.segundo);
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setHora(int hora) {
		if(hora <= 23 && hora >= 0)
			this.hora = hora;
		
		else this.hora = 0;
	}

	public void setMinuto(int minuto) {
		if(minuto <= 59 && minuto >= 0)
			this.minuto = minuto;
		
		else this.minuto = 0;
	}

	public void setSegundo(int segundo) {
		if(segundo <= 59 && segundo >= 0)
			this.segundo = segundo;
		
		else this.segundo = 0;
	}
	
	public void aumentaMinuto() {
		if(this.minuto == 59) {
			this.hora++;
			this.minuto = 0;
		}
		else this.minuto++;
		
	}
	
	public void diminuiMinuto() {
		if(this.minuto == 0) {
			this.hora--;
			this.minuto = 59;
		}
		else this.minuto--;
	}
	
}

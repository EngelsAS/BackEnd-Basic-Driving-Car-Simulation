package exerc_rev_quest_3;

public class Carro {
	
	private int percorrido;
	private Tanque t=new Tanque();
	private Pneus p = new Pneus();
	public Carro() {
		
		percorrido=0;
		
	}
	public int getAbastece() {
		return t.getAtual();
	}
	public void Abastecer(int abastece) {
		
		t.Abastecer(abastece);
		
	}
	public int getPercorrido() {
		return percorrido;
	}
	public void Avançar(int anda) {
		
		if(p.getLb()>20) { 
			
			t.reduzirGasolina(anda);
			percorrido = percorrido + t.andou1(anda);

		}else {
			t.reduzirGasolina2(anda);
			percorrido = percorrido + t.andou2(anda);
		}
		
	}
	public int getCalibra() {
		return p.getLb();
	}
	public void setCalibra(int calibra) {
		p.CalibrarPneus(calibra);
	}
	
	public String toString() {
		return "A distância percorrida pelo veiculo ate o momento atual foi de " +percorrido+ "Km. O combustivél restante é: "+t.getAtual();
	}
	
}

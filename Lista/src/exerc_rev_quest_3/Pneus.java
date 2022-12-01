package exerc_rev_quest_3;

public class Pneus {
	
	private int lb;
	public Pneus() {
		
		lb=27;
	}

	public void CalibrarPneus(int lb) {
		
		this.lb=lb;
		System.out.println("Pneu reajustado para "+lb+"lb.");
		
	}

	public int getLb() {
		return lb;
	}
	
}

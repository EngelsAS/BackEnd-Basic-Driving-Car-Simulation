package exerc_rev_quest_3;

public class Tanque {
	
	private int capTotal;
	private int Atual;
	private int consumo;
	private int andaLimite;
	private int andou;
	public Tanque() {
		
		capTotal=50;
		Atual=0;
		andaLimite=0;

	}
	
	public void Abastecer(int abastece) {
		
		if((Atual + abastece)<capTotal) {
			Atual=Atual + abastece;
			System.out.println("você abasteceu "+abastece+" litros com sucesso. O veiculo está com um total de "+Atual+" litros de combustivel");
			if(Atual>50) {
				System.out.println("Você esta tentando abastecer o tanque em "+Atual+" litros, porem esse valor ultrapassa o máximo. Comando invalido, tente novamente");
				Atual=Atual-abastece;
			}
		}else {
			System.out.println("O tanque só tem capacidade para 50 litros, esse valor nao pode ser ultrapassado!");
		}
		
	}
	
	public void reduzirGasolina(int anda) {
		
		Motor m = new Motor();
		consumo = m.getConsumo();
		int consumido = anda/consumo;

		if(consumido<=Atual) {
			Atual = Atual - consumido;
			andou=anda;
		}else{
			System.out.println("O veiculo não tem gasolina o suficiente pra completar todo o percurso. Recalculando para ir ate o limite");
		    andaLimite = Atual*consumo;
		    Atual = 0;
		}

		
	}
	
	public void reduzirGasolina2(int anda) {
		
		Motor m = new Motor();
		consumo = m.getConsumo();
		consumo = consumo + (30/100*consumo);
		int consumido = anda/consumo;
		if(consumido<=Atual) {
			Atual = Atual - consumido;
			andou=anda;
		}else {
			System.out.println("O veiculo não tem gasolina o suficiente pra completar todo o percurso. Recalculando para ir ate o limite");
		    andaLimite = Atual*consumo;
		    Atual = 0;
		}
	}
	
	public int andou1(int anda) {
		
		Motor m = new Motor();
		consumo = m.getConsumo();
		int consumido = anda/consumo;

		if(consumido<=Atual) {
			return andou;
		}
			return andaLimite;
	}
	
	public int andou2(int anda) {
		
		Motor m = new Motor();
		consumo = m.getConsumo();
		consumo = consumo + (30/100*consumo);
		int consumido = anda/consumo;
		if(consumido<=Atual) {
			return andou;
			
		}else 
			return andaLimite;
		
	}

	public int getAtual() {
		return Atual;
	}

}

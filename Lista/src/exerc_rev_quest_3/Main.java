package exerc_rev_quest_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		Carro c = new Carro();
		int y;
		
		System.out.print("Escolha uma das opções abaixo \n 1-Abastecer \n 2-Avançar \n 3-Calibrar Pneus \n 4-Exibir informações sobre componentes do veiculo\n 0-sair");
	    x = sc.nextInt();
		
		while(x!=0) {
			switch (x) {
			case 1:
				System.out.println("Quantos litros deseja abastecer?");
				y = sc.nextInt();
				c.Abastecer(y);
				System.out.println(c);
				break;
			case 2:
				System.out.println("Quantos Km deseja avançar?");
				y = sc.nextInt();
				c.Avançar(y);
				System.out.println(c);
				break;
			case 3:
				System.out.println("Calibrar em quantas libras?");
				y = sc.nextInt();
				c.setCalibra(y);
				System.out.println(c);
				break;
			case 4:
				System.out.print("Combustivel atual em: "+c.getAbastece()+"\n Calibragem atual dos Pneus em: "+c.getCalibra()+ "\n Kms percorridos: "+c.getPercorrido());
			}
			System.out.print("Escolha uma das opções abaixo \n 1-Abastecer \n 2-Avançar \n 3-Calibrar Pneus \n 4-Exibir informações sobre componentes do veiculo\n 0-sair\n");
			x = sc.nextInt();
		}
		
		System.out.println("Programa encerrado");
		System.out.println(c);
		sc.close();
	}
	

}

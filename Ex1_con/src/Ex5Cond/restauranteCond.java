package Ex5Cond;

import java.util.Scanner;

public class restauranteCond {

	public static void main(String[] args) {
		
		// Atribuir os valores dos lanches
		int cod1 , cod2 , cod3 , cod4, cod5;
		
		cod1 = 1;
		cod2 = 2;
		cod3 = 3;
		cod4 = 4;
		cod5 = 5;
		
		//Menu
		System.out.println("======== MENU DA LANCHONETE ========");
		System.out.println("Código  Produtos	  Preço");
		System.out.println("-------------------------------------");
		System.out.println("  1     Cachorro-Quente  R$4.00");
		System.out.println("  2     X-Salada         R$4.50");
		System.out.println("  3     X-Bacon          R$5.00");
		System.out.println("  4     Torrada Simples  R$2.00");
		System.out.println("  5     Refrigerante     R$1.50");
		System.out.println("-------------------------------------");

		//Pedido e calculo do total
		
		int quant , codCliente;
		
		double valorTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o código do produto que deseja: ");
		codCliente = sc.nextInt();
		
		System.out.print("");
		
		System.out.print("Agora a quantidade desse produto: ");
		
		quant = sc.nextInt();
		
		System.out.print("");
		
		//Condicionais
		
		if (codCliente == cod1) {
			
			valorTotal = valorTotal + (4 * quant);
			
		}
		
		if (codCliente == cod2) {
			
			valorTotal = valorTotal + (4.50 * quant);
			
		}
		
		if (codCliente == cod3) {
			
			valorTotal = valorTotal + (5 * quant);
			
		}
		
		if (codCliente == cod4) {
			
			valorTotal = valorTotal + (2 * quant);
			
		}
		
		if (codCliente == cod5) {
			
			valorTotal = valorTotal + (1.50 * quant);
			
		}
		
		System.out.println("");
		System.out.printf("Valor total: R$%.2f", valorTotal);
		
	}

}

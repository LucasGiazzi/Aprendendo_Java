package Ex1Cond;

import java.util.Scanner;

public class ex1Cond {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");

		num = sc.nextInt();

		if (num == 0) {

			System.out.println("O número é ZERO!");

		} else {
			if (num > 0) {
				System.out.printf("O número %d é POSITIVO!", num);
				
			} else {
				System.out.printf("O número %d é NEGATIVO!", num);
			}

		}
	}
}

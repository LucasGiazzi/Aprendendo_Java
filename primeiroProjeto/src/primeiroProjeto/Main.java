package primeiroProjeto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int var;
		String x;
		String y;
		String z;

		var = sc.nextInt();
		sc.nextLine();
		
		x = sc.nextLine();

		y = sc.nextLine();

		z = sc.nextLine();

		System.out.println("Você digitou: " + var + " " + x + " " + y + " " + z);

		sc.close();
	}

}

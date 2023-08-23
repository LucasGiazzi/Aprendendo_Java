package application;

import java.util.Locale;
import java.util.Scanner;

import entities.storage;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		storage product = new storage();
		
		System.out.println("Enter products data:");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.qtd = sc.nextShort();
		
		System.out.print("Product Data: " + product);
		System.out.println();

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		short quantity = sc.nextShort();
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextShort();
		
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}

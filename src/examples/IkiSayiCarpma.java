package examples;

import java.util.Scanner;

public class IkiSayiCarpma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1. sayýyý girin : ");
		double number1 = scan.nextDouble();

		System.out.print("2. sayýyý girin : ");
		double number2 = scan.nextDouble();

		double total = number1 * number2;

		System.out.println("Çarpým sonucu : " + total);
	}
}

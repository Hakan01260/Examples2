package examples;

import java.util.Scanner;

public class IkiSayiCarpma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1. say�y� girin : ");
		double number1 = scan.nextDouble();

		System.out.print("2. say�y� girin : ");
		double number2 = scan.nextDouble();

		double total = number1 * number2;

		System.out.println("�arp�m sonucu : " + total);
	}
}

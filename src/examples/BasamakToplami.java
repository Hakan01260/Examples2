package examples;

import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir Sayý Girin: ");
		int number = scan.nextInt();

		int total = 0, remainder;

		while (number != 0) {
			remainder = number % 10;
			total += remainder;
			number /= 10;
		}
		System.out.println("Girilen Sayýnýn Basamaklarý Toplamý : " + total);

	}

}

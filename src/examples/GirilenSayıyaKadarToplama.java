package examples;

import java.util.Scanner;

public class GirilenSayıyaKadarToplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayıyı girin : ");
		int number = scan.nextInt();

		int total = (number * (number + 1)) / 2;

		System.out.println("Girilen sayıya kadar olan sayıların toplamı : " + total);

	}

}

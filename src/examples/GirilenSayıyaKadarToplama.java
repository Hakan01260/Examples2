package examples;

import java.util.Scanner;

public class GirilenSay�yaKadarToplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Say�y� girin : ");
		int number = scan.nextInt();

		int total = (number * (number + 1)) / 2;

		System.out.println("Girilen say�ya kadar olan say�lar�n toplam� : " + total);

	}

}

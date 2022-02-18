package examples;

import java.util.Scanner;

public class GirilenSayýyaKadarToplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Sayýyý girin : ");
		int number = scan.nextInt();

		int total = (number * (number + 1)) / 2;

		System.out.println("Girilen sayýya kadar olan sayýlarýn toplamý : " + total);

	}

}

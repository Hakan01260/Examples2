package examples;

import java.util.Scanner;

public class YerDegistirme {

	public static void main(String[] args) {

		double number1, number2, x, y;

		Scanner scan = new Scanner(System.in);

		System.out.print("1. say�y� girin : ");
		number1 = scan.nextDouble();

		System.out.print("2. say�y� girin : ");
		number2 = scan.nextDouble();

		System.out.println("== De�i�imden �nce ==");
		System.out.println("Birinci say� :" + number1);
		System.out.println("�kinci say� :" + number2);

		x = number2;
		y = number1;

		System.out.println("== De�i�imden sonra ==");
		System.out.println("Birinci say� :" + x);
		System.out.println("�kinci say� :" + y);

	}

}

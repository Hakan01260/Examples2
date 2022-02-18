package examples;

import java.util.Scanner;

public class YerDegistirme {

	public static void main(String[] args) {

		double number1, number2, x, y;

		Scanner scan = new Scanner(System.in);

		System.out.print("1. sayýyý girin : ");
		number1 = scan.nextDouble();

		System.out.print("2. sayýyý girin : ");
		number2 = scan.nextDouble();

		System.out.println("== Deðiþimden önce ==");
		System.out.println("Birinci sayý :" + number1);
		System.out.println("Ýkinci sayý :" + number2);

		x = number2;
		y = number1;

		System.out.println("== Deðiþimden sonra ==");
		System.out.println("Birinci sayý :" + x);
		System.out.println("Ýkinci sayý :" + y);

	}

}

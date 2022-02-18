package examples;

import java.util.Scanner;

public class IkiTamSayininToplamai {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1. sayýyý girin : ");
		int number1 = scan.nextInt();

		System.out.print("2. sayýyý girin : ");
		int number2 = scan.nextInt();

		int total = number1 + number2;

		System.out.println("Sayýlar : " + number1 + " " + number2);
		System.out.println("Toplam :" + total);
	}

}

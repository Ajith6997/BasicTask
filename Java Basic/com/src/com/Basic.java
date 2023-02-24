package com;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		String name;
		String strd = new String();

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter a String: ");

			name = input.nextLine();

			if (name.equals("exit")) {
				break;
			}
			strd += name;
		}
			System.out.println("String exited:"+strd);

		

	}

}

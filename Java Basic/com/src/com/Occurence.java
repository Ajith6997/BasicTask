package com;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int i, len;
		int counter[] = new int[256];
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter a string: ");

		name = myobj.nextLine();

		len = name.length();

		for (i = 0; i < len; i++) {
			counter[(int) name.charAt(i)]++;
		}

		for (i = 0; i < 256; i++) {
			if (counter[i] != 0) {

				System.out.println((char) i + " --> " + counter[i]);
			}
		}
	}
}
 
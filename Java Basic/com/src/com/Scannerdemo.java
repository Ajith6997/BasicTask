package com;

import java.util.Scanner;

public class Scannerdemo {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an Integer: ");
	int a = sc.nextInt();
	sc.nextLine();
	String str = sc.nextLine();
	int age = sc.nextInt();
	
	System.out.println("Value is: "+a);
	System.out.println("Value is: "+str);
	System.out.println("Value is: "+age);
}
}

package com;

import java.util.Scanner;

public class Packagescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name,age,dob,salary,idno,percentage,mobile");
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		short dob = myObj.nextShort();
		double salary = myObj.nextDouble();
		byte idno = myObj.nextByte();
		float percentage = myObj.nextFloat();
		long mobile = myObj.nextLong();

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Dob:" + dob);
		System.out.println("Salary:" + salary);
		System.out.println("Idno:" + idno);
		System.out.println("Percentage:" + percentage);
		System.out.println("Mobile:" + mobile);
		System.out.print("name,age,dob,salary,idno,percentage,mobile");
	}

} 
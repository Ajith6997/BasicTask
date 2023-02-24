package com;

//"AJITH,ajith69@gmail.com,6997,9095296319,savings"
//Mudukulathur,Ramanathapuram,Tamilnadu,India
//Thulukampatti,Thanjavur,Tamilnadu,India
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		Collection aaa = new Collection();
		aaa.mydetails();
	}

	public void mydetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer details");

		String fff = scan.nextLine();

		String[] details = fff.split(",");

		System.out.println(Arrays.toString(details));
		if (details.length != 5) {
			System.out.println("Details is missing");
			mydetails();
		}

		else {
			System.out.println("continue");

		}
		System.out.println("Enter the address 1");

		String ddd = scan.nextLine();
		String[] address = ddd.split(",");

		System.out.println(Arrays.toString(address));
		if (address.length != 4) {
			System.out.println("Address is missing");
			mydetails();

		} else {
			System.out.println("continue");

		}

		System.out.println("Enter the address 2");

		String eee = scan.nextLine();
		String[] address2 = eee.split(",");

		System.out.println(Arrays.toString(address2));
		if (address2.equals("No")) {

			System.out.println(fff);
			HashMap<String, String> customer = new HashMap<String, String>();
			customer.put(ddd, eee);
			HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
			cus.put(fff, customer);

			System.out.println("hashmap" + cus);

		} else {

			if (address2.length != 4) {

				System.out.println("Address is missing");
				mydetails();

			} else {

				System.out.println("continue");

			}
			HashMap<String, String> customer = new HashMap<String, String>();
			customer.put(ddd, eee);
			HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
			cus.put(fff, customer);

			System.out.println("hashmap" + cus);

		}
	}

}

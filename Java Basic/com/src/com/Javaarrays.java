package com;

public class Javaarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int i, n;
		System.out.println("Original array; ");
		n=arr.length;
		for (i = 0; i < n; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("Array in reverse order; ");
		for (i = n-1; i>= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}

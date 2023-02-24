package com;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int temp = 0;
		for (int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length/2 + i];
			a[a.length/2+i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
      
                 
	}

}

package com;

public class Overloading {
	static int add (int a,int b) {
		return a+b;
	}
	static int add (int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(13,23));
		System.out.println(add(13,23,33));

	}

}

package com;

public class assignmentoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		x &=3;
		byte y = 5;
		y ^=3;
		short z = 25;
		z |= 3;
		double a = 19.55d;
		a += 3;
	    float b = 5.96f;
		b -= 3;
		long c = 699727L;
		c *= 3;
		int d = 5;
		d /= 3;
		int e = 5;
		e %=3;
		int f =5;
		f >>=3;
		int g = 5;
		g <<= 3;
		int h = 5;
		System.out.println(x+" , "+y+" , "+z+" , "+a+" , "+b+" , "+c+" , "+d+" , "+e+" , "+f+" , "+g+" , "+(h>3 && h<10)+" , "+(h>3 || h<10)+" , "+(!(h>3 && h<10)));
		   

	}

}
 
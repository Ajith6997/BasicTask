 package com;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		try (Scanner ak = new Scanner(System.in)) {
			System.out.println("Enter the marks(0-100):");
			mark = ak.nextInt();
		}
		if(mark>=90) {
	    System.out.println("Grade A");
	    }
	    else if(mark>=80) {
	    	System.out.println("Grade B");
	    }
	    else if(mark>=70) {
	    	System.out.println("Grade C");
	    }
	    else if(mark>=60) {
	    	System.out.println("Grade D");
	    }
	    else if(mark>=50) {
	    	System.out.println("Grade E");
	    }
	    
	    
		
		

	}

}

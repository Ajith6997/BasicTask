package com;

public class Stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name1 = "AJITH";
	       String name2 = "JEEVITH";
	       
	       System.out.println("String before swap: "+name1+" "+name2);
	       
	       name1 = name1 + name2;
	       
	       name2 = name1.substring(0,(name1.length()-name2.length()));
	       name1 = name1.substring(name2.length());
	       System.out.println("String after swap: "+name1+" "+name2);

	}

}

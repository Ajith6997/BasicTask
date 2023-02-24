package com;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		acc.setName("AJITH KUMAR");
		acc.setEmail("ajithjeevith2711@gmail.com");
		acc.setAcc_no(88201000052476L);
		acc.setAmount(300000f);
		
		System.out.println(acc.getName()+" "+acc.getEmail()+" "+acc.getAcc_no()+" "+acc.getAmount());

	}

}

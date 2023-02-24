package com;

public abstract class Bike {
	abstract void run();
}	
	class Yamaha extends Bike{
		void run() {
			System.out.println("firstclass bike in the world...");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike obj = new Yamaha();
     obj.run();
	}

	}

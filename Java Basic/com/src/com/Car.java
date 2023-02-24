package com;

public abstract class Car {
	abstract void specification();

	public void MAHINDRA() {
		System.out.println("THAR");
	}
}

class Thar extends Car {
	void specification() {
		System.out.println("Thar specification: It is luxiory");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thar obj = new Thar();
		obj.MAHINDRA();
		obj.specification();

	}

}

package com;

public class Animal {
	void eat() {
		System.out.println("eating:");
	}
}	
	class Lion extends Animal {
		void hunt() {
	      System.out.println("hunting:");
	}
}
	class Lioncub extends Lion {
		void play() {
			System.out.println("playing:");
		}
}
	class Testinheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lioncub obj = new Lioncub();
		obj.eat();
		obj.hunt();
		obj.play();

	}

}

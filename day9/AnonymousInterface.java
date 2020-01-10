package com.cts.day9;

public class AnonymousInterface {
	public static void main(String[] args) {
		TestInterface t = new TestInterface() {
			public void display() {
				System.out.println("good morning");
			}
		};
		t.display();
	}
}

interface TestInterface {
	void display();
}

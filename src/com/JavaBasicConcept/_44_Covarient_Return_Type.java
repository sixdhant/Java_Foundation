/*  		Co-varient Return Type								*/

package com.JavaBasicConcept;

public class _44_Covarient_Return_Type {
	public static void main(String[] args) {
		B27 B = new B27();
		B.show();
	}
}

class A27 {
	A27 show() {
		System.out.println("siddhant");
		return new A27(); // this --- A27();
	}
}

class B27 extends A27 {
	@Override
	B27 show() {
		super.show();
		System.out.println("deshmukh");
		return this; // this --- B27();
	}
}

/*
 * 
 * Siddhant Deshmukh
 * 
 */
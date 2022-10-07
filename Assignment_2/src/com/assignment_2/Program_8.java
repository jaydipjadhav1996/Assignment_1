package com.assignment_2;

public class Program_8 {
	Program_8() {
		System.out.println("Object Is Created");
	}

	protected void finalize() {
		System.out.println("Object Is Destroyed");
	}

	public static void main(String[] args) {
		Program_8 pe = new Program_8();
		// System.out.println(pe.hashCode());
		// System.out.println(pe.hashCode());
		pe = null;// By giving Null Refrence
		// System.out.println(pe);
		Program_8 p1 = new Program_8();
		// System.out.println(p1.hashCode());
		Program_8 p2 = new Program_8();
		// System.out.println(p2.hashCode());
		p1 = p2; // By Assigning
		new Program_8();// anoymonous object refrence
		// System.out.println(p1.hashCode());
		// System.out.println(pe.hashCode());
		// System.out.println(p2.hashCode());
		System.gc();
	}
	// System.out.println("Four Objects Are Created And Two Objects Are Destroyed");
}

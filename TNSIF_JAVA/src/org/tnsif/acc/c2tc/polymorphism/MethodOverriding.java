package org.tnsif.acc.c2tc.polymorphism;

class Calculator{
	
	int add(int a,int b) {
		return a+b;
	}
	int diff(int a,int b,int d) {
		return a-b-d;
	}
	int mul(int a,int b,int c) {
		return a*b*c;
	}
public class MethodOverriding{

	public static void main(String[] args) {
		Calculator cc=new Calculator();
		System.out.println("Two integers sum "+cc.add(1, 3));
		System.out.println("Three integres sum "+cc.diff(3, 6,8));
		System.out.println("Two double datatype sum "+cc.mul(3,6,7));
	}
}
}
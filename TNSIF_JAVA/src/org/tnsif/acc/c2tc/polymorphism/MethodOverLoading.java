package org.tnsif.acc.c2tc.polymorphism;

class A
{
	int add(int a,int b)
	{
		return a+b;
    }
		int add(int n1,int n2,int n3)
		{
			
			return n1+n2+n3;
		}
	}
public class MethodOverLoading {
	public static void main(String[]args) {
		A obj=new A();
		 System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10,20));
	}	
}
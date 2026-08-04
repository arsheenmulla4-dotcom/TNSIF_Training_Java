package org.tnsif.acc.c2tc.scannermethod_buffermethod;
import java.util.*;

public class ScannerMethodDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		
		System.out.println("Emloyee_Name:"+name);
		System.out.println("Employee_ID:"+id);
		sc.close();
	}

}

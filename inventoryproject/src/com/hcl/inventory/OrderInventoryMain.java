package com.hcl.inventory;

import java.util.Scanner;

public class OrderInventoryMain{
	public static void main(String[] args) {
		String stid;
		int orderedquantity;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stock id :");
		stid=sc.nextLine();
		System.out.println("enter orderedquantity : ");
		orderedquantity=Integer.parseInt(sc.nextLine());
		System.out.println(InventoryBAL.orderInventoryBal(stid, orderedquantity));	
	}
}


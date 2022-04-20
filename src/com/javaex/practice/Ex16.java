package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double pri = sc.nextDouble();
		System.out.print("받은 돈: ");
		double pay = sc.nextInt();
		double tax = pri * 0.1;
		
		double money = pay - pri - tax;
		
		System.out.println("==========================");
		System.out.println("받은돈: "+pay);
		System.out.println("상품가격: "+pri);
		System.out.println("부가세: " +tax);
		System.out.println("잔액: " + money);
		
		sc.close();
	}

}

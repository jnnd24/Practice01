package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("500원 개수: ");
		int coin500 = sc.nextInt();

		System.out.print("100원 개수: ");
		int coin100 = sc.nextInt();

		System.out.print("50원 개수: ");
		int coin50 = sc.nextInt();

		System.out.print("10원 개수: ");
		int coin10 = sc.nextInt();
		
		int sum = coin500*500 + coin100*100 + coin50*50 + coin10*10;
		System.out.println("동전의 총합은 " + sum + " 원 입니다.");
		
		
		
	}

}

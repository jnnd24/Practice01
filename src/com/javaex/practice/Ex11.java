package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		int sal = sc.nextInt();
		System.out.println("10년간 최대 저축액은 "+sal*10*12+"원 입니다.");
		
		sc.close();
	}

}

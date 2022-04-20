package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		System.out.println("구의 부피는 "+(double)(4.0/3.0*3.14*r*r*r)+" 입니다.");
		
		
		sc.close();
		
	}

}

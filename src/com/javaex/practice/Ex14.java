package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.print("가로를 입력하세요: ");
		double sqW = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double sqH = sc.nextDouble();
		
		
		double ext = sqW * sqH; // 넓이
		double cir = sqW+sqW+sqH+sqH;
		System.out.println("사각형의 넓이: "+ext);
		System.out.println("사각형의 둘레: "+cir);
		
		
		sc.close();
	}

}

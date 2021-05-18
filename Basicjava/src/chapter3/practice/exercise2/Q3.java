package chapter3.practice.exercise2;

import java.util.Scanner;

//스캐너를 이용 정수 입력받고 * 출력
//*****
//****
//***
//**
//*
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수를 입력하시오>>");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

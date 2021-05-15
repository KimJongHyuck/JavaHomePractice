package chapter2.practice.exercise;

import java.util.Scanner;

//정수로 된 돈의 액수를 입력받아 오만,만원,500원,100원,50원,10원,1원 각 몇개로 변환되는지 출력하라.
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("오만원권 : " +num/50000 + "매");
		System.out.println("만원권 : "+ num%50000/10000 +"매");
		System.out.println("천원권 : "+ num%50000%10000/1000 +"매");
		System.out.println("백원 : "+ num%50000%10000%1000/100 +"개");
		System.out.println("오십원 : "+ num%50000%10000%1000%100/50 +"개");
		System.out.println("십원 : "+ num%50000%10000%1000%100%50/10 +"개");
		System.out.println("일원 : "+ num%50000%10000%1000%100%50%10/1 +"개");
		
		sc.close();
	}

}

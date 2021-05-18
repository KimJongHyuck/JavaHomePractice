package chapter3.practice.exercise2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<unit.length; i++) {
			if(money/unit[i] != 0) {
				System.out.println(unit[i]+"원 짜리 :" +money/unit[i] + "개");
			} 
			result = money%unit[i];
			money = result;	
			
		}
		sc.close();
		
	}

}

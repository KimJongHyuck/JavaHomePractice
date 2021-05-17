package chapter2.practice.exercise;

import java.util.Scanner;

//사칙연산을 입력받아 계산하는 프로그램.
//+ - * / 네가지 , 0으로 나누기시 0으로 나눌 수 없습니다.출력
public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		int result = 0;
		
//		if(op.equals("+")) {
//			result = num1+num2;
//		}else if(op.equals("-")) {
//			result = num1-num2;
//		}else if(op.equals("*")) {
//			result = num1*num2;
//		}else if(op.equals("/")) {
//			if(num2 !=0) {
//				result = num1/num2;
//			} else {
//				System.out.println("0으로 나눌 수 없습니다.");
//				sc.close();
//				return;
//			}
//		}
//		
//		System.out.println(num1+op+num2+"의 계산 결과는 : " + result);

		switch(op) {
			case "+" :
				result = num1+num2;
				break;
			case "-" :
				result = num1-num2;
				break;
			case "*" :
				result = num1*num2;
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					sc.close();
				}
				result = num1/num2;
				break;
			default :
				System.out.println("사칙연산이 아닙니다.");
				sc.close();
				break;
		}
		System.out.println(num1+op+num2+"의 계산 결과는 : " + result);
		
		
		sc.close();
		
		
	}

}

package chapter2.practice.exercise;

import java.util.Scanner;

//��Ģ������ �Է¹޾� ����ϴ� ���α׷�.
//+ - * / �װ��� , 0���� ������� 0���� ���� �� �����ϴ�.���
public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����>>");
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
//				System.out.println("0���� ���� �� �����ϴ�.");
//				sc.close();
//				return;
//			}
//		}
//		
//		System.out.println(num1+op+num2+"�� ��� ����� : " + result);

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
					System.out.println("0���� ���� �� �����ϴ�.");
					sc.close();
				}
				result = num1/num2;
				break;
			default :
				System.out.println("��Ģ������ �ƴմϴ�.");
				sc.close();
				break;
		}
		System.out.println(num1+op+num2+"�� ��� ����� : " + result);
		
		
		sc.close();
		
		
	}

}

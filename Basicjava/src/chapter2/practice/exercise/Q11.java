package chapter2.practice.exercise;

import java.util.Scanner;

//if-else, swith문 이용해서
//3~5 봄 6~8 여름 9~11 가을 12,1,2 겨울 출력 그 외숫자는 잘못입력을 출력하라.
public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		if(month >= 1 && month <= 12) {
			if(month == 3 || month == 4 || month == 5) {
				System.out.println("봄");
			} else if(month == 6 || month == 7 || month == 8) {
				System.out.println("여름");
			} else if(month == 9 || month == 10 || month == 11) {
				System.out.println("가을");
			} else if(month == 12 || month == 1 || month == 2) {
				System.out.println("겨울");
			}
		} else {
			System.out.println("잘못 입력");
		}
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
			
		default:
			System.out.println("잘못 입력");
		}
		
		sc.close();
	}

}

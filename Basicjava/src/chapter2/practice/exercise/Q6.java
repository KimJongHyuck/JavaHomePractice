package chapter2.practice.exercise;

import java.util.Scanner;

/*
 * 369게임을 간단히 작성해보자.
 * 1~99까지의 정수를 입력받고 정수에 3,6,9중 하나가
 * 있는 경우는 박수짝을 출력하고 두 개가 있는 경우는 박수짝짝을
 * 출력하는 프로그램을 작성하라.
 */
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ten,il;
		
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		
		ten = num/10;
		il = num%10;
		
		if(num != 0 && num <= 99) {
			
			if((ten == 3 || ten == 6 || ten == 9) && 
					(il == 3 || il == 6 || il == 9)) {
						System.out.println("박수 짝짝");
			}else if((ten == 3 || ten == 6 || ten == 9) || 
					(il == 3 || il == 6 || il == 9)) {
						System.out.println("박수 짝");
			}
		} else {
			System.out.println("숫자의 범위를 벗어났습니다.");
		}
		sc.close();
	}

}

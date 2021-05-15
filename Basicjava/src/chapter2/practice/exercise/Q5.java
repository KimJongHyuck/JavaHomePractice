package chapter2.practice.exercise;

import java.util.Scanner;

//삼각형의 변의 길이를 나타내는 정수 3개를 입력받고 삼각형을 만들수 있는지 판별하라.
//두 변의 합이 다른 한 변의 합보다 커야한다.
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >>");
		int num1,num2,num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1+num2)<num3 || (num1+num3)<num2 || (num2+num3)<num1) {
			System.out.println("삼각형이 될 수없습니다.");
		} else {
			System.out.println("삼각형이 됩니다.");
		}

		sc.close();
	}

}

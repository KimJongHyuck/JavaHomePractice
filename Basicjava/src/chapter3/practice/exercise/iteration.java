package chapter3.practice.exercise;

import java.util.Scanner;

//while문 사용 -1을 입력받을때까지 정수의 합을 구하고 평균 출력하기
public class iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int sum=0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int num = sc.nextInt();
		
		while(num != -1) {
			count++;
			sum += num;
			num = sc.nextInt();
		}

		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 개수는" + count + "이며");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		
		sc.close();
	}

}

package chapter2.practice.exercise;
//원화를 입력받아 달러로 바꾸기. $1=1100로 계산.
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요.");
		int one = sc.nextInt();
		double dollor = one / 1100;
		
		System.out.println(one + "원은 $" + dollor + "입니다.");
	}
}

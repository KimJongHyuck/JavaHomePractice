package Array;

import java.util.Scanner;

//배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라.
public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 정수를 입력하세요>>");
		int num [] = new int[5];
		int sum = 0;
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("평균은"+ (double)sum/num.length + "입니다.");
		

	}

}

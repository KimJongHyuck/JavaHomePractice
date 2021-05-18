package Array;

import java.util.Scanner;

//양수 5개를 입력받아 배열에 저장하고 제일 큰 수를 출력하는 프로그램을 작성하라.
public class ArrayEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요.");
		int num[] = new int[5];
		int max=0;
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();
	}
}

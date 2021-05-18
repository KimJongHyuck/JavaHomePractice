package chapter3.practice.exercise2;

import java.util.Scanner;

//정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수)
//정수 배열을 생성하고, 이곳에 1~100까지 범위의 정수를 중복없이 삽입후 출력
//????
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개??");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*100+1);
			arr[i] = r;
			
			for(int j=0; j<i; j++) {
				if(arr[j] == r) {
					i--;
					break;
				}
			}
		}
		
		int line = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			line++;
			if(line == 10) {
				System.out.println();
				line = 0;
			}
			
		}
		
	}

}

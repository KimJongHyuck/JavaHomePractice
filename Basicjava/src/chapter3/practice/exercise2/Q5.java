package chapter3.practice.exercise2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int intArray[] = new int[10];
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.print("3�� ����� ");
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]%3 == 0) {
				System.out.print(intArray[i]+" ");
			}
		}
		sc.close();

	}

}

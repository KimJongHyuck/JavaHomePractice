package Array;

import java.util.Scanner;

//�迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷��� �ۼ��϶�.
public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5���� ������ �Է��ϼ���>>");
		int num [] = new int[5];
		int sum = 0;
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		System.out.println("�����"+ (double)sum/num.length + "�Դϴ�.");
		

	}

}

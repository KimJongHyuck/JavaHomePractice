package Array;

import java.util.Scanner;

//��� 5���� �Է¹޾� �迭�� �����ϰ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�.
public class ArrayEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� 5���� �Է��ϼ���.");
		int num[] = new int[5];
		int max=0;
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		sc.close();
	}
}

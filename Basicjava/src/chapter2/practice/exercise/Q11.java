package chapter2.practice.exercise;

import java.util.Scanner;

//if-else, swith�� �̿��ؼ�
//3~5 �� 6~8 ���� 9~11 ���� 12,1,2 �ܿ� ��� �� �ܼ��ڴ� �߸��Է��� ����϶�.
public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = sc.nextInt();
		
		if(month >= 1 && month <= 12) {
			if(month == 3 || month == 4 || month == 5) {
				System.out.println("��");
			} else if(month == 6 || month == 7 || month == 8) {
				System.out.println("����");
			} else if(month == 9 || month == 10 || month == 11) {
				System.out.println("����");
			} else if(month == 12 || month == 1 || month == 2) {
				System.out.println("�ܿ�");
			}
		} else {
			System.out.println("�߸� �Է�");
		}
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			break;
			
		default:
			System.out.println("�߸� �Է�");
		}
		
		sc.close();
	}

}

package chapter3.practice.exercise;

import java.util.Scanner;

//while�� ��� -1�� �Է¹��������� ������ ���� ���ϰ� ��� ����ϱ�
public class iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int sum=0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int num = sc.nextInt();
		
		while(num != -1) {
			count++;
			sum += num;
			num = sc.nextInt();
		}

		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("������ ������" + count + "�̸�");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		
		sc.close();
	}

}

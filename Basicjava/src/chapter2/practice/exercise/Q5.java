package chapter2.practice.exercise;

import java.util.Scanner;

//�ﰢ���� ���� ���̸� ��Ÿ���� ���� 3���� �Է¹ް� �ﰢ���� ����� �ִ��� �Ǻ��϶�.
//�� ���� ���� �ٸ� �� ���� �պ��� Ŀ���Ѵ�.
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է� >>");
		int num1,num2,num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1+num2)<num3 || (num1+num3)<num2 || (num2+num3)<num1) {
			System.out.println("�ﰢ���� �� �������ϴ�.");
		} else {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}

		sc.close();
	}

}

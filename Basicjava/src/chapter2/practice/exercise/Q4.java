package chapter2.practice.exercise;
//���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ���.
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("���� 3�� �Է�>>");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b<a && a<c) {
			System.out.println("�߰����� "+ a + "�Դϴ�.");
		}else if(a<b && b<c) {
			System.out.println("�߰����� "+ b + "�Դϴ�.");
		
		}else {
			System.out.println("�߰����� " + c + "�Դϴ�.");
		}
		sc.close();

	}

}

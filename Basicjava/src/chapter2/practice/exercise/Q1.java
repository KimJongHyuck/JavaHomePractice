package chapter2.practice.exercise;
//��ȭ�� �Է¹޾� �޷��� �ٲٱ�. $1=1100�� ���.
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���.");
		int one = sc.nextInt();
		double dollor = one / 1100;
		
		System.out.println(one + "���� $" + dollor + "�Դϴ�.");
	}
}

package chapter2.practice.exercise;

import java.util.Scanner;

//���簢���� �����ϴ� �� ��(x1, y1) (y1,y2)�� �Է¹޾� (100,100),(200,200)��
//�� ������ �̷���� ���簢���� �浹�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x1,y1) , (x2,y2)�� �Է��ϼ���>>");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		if((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
			System.out.println("�簢���� �浹��");
		} else if((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)) {
			System.out.println("�簢���� �浹��");
		} else if((x1 <= 100 && x2 >= 200) && (y1 <= 100 && y2 >= 200)) {
			System.out.println("�簢���� �浹��");
		} else {
			System.out.println("�簢���� �浹���� �ʽ��ϴ�.");
		}

		sc.close();
		

		
	}

}

package chapter4.practice.exercise;

import java.util.Scanner;

//�ʺ�� ���̸� �Է¹޾� �簢���� ���� ����ϴ� ���α׷��� �ۼ��϶�.
//�ʺ�� ���� �ʵ�, �������� �����ϴ� getArea() �޼ҵ带 ���� Rectangle Ŭ������ ����� Ȱ��.
public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle(); //��ü ����
		
		System.out.print(">>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("�簢���� ������ "+ rect.getArea());
		sc.close();

	}

}

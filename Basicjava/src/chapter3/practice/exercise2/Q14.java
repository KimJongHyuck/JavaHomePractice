package chapter3.practice.exercise2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course [] = { "java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("�����̸�>>");
			String name = sc.next();
			
			if(name.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
			int i = 0;
			for(i=0; i<course.length; i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(name + "�� ������" + n);
					break;
				} 
			}
			
			if(i==score.length) // ������� �߸��� ��� �� if���� ����� �迭�� ���̿� ��������
				System.out.println("���� �����Դϴ�.");		
		}
		
		sc.close();
	}
}

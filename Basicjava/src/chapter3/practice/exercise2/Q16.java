package chapter3.practice.exercise2;

import java.util.Scanner;

//��ǻ�Ϳ� �������� �� ������ ������.
//�׸��� �Է��ϸ� ����
//
public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("���� ���� ��!!>>");		
			String answer = sc.next();
			
			if(answer.equals("�׸�")) {
				System.out.println("������ �����մϴ�..");
				break;
			} 
			
			if(str[n].equals("����")) {
				if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
										+ str[n] + " �����ϴ�.");
				} else if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " ����ڰ� �̰���ϴ�.");
				} else if(answer.equals("��")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " ����ڰ� �����ϴ�.");
				}
			}
			
			if(str[n].equals("����")) {
				if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
										+ str[n] + " ����ڰ� �����ϴ�..");
				} else if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " �����ϴ�.");
				} else if(answer.equals("��")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " ����ڰ� �̰���ϴ�..");
				}
			}
			
			if(str[n].equals("��")) {
				if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
										+ str[n] + " ����ڰ� �̰���ϴ�.");
				} else if(answer.equals("����")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " ����ڰ� ������ϴ�.");
				} else if(answer.equals("��")) {
					System.out.println("����� = " + answer + ", ��ǻ�� = " 
							+ str[n] + " �����ϴ�.");
				}
			}
		}
		sc.close();	
	}

}

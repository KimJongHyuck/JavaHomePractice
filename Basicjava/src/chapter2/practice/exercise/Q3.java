package chapter2.practice.exercise;

import java.util.Scanner;

//������ �� ���� �׼��� �Է¹޾� ����,����,500��,100��,50��,10��,1�� �� ��� ��ȯ�Ǵ��� ����϶�.
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.println("�������� : " +num/50000 + "��");
		System.out.println("������ : "+ num%50000/10000 +"��");
		System.out.println("õ���� : "+ num%50000%10000/1000 +"��");
		System.out.println("��� : "+ num%50000%10000%1000/100 +"��");
		System.out.println("���ʿ� : "+ num%50000%10000%1000%100/50 +"��");
		System.out.println("�ʿ� : "+ num%50000%10000%1000%100%50/10 +"��");
		System.out.println("�Ͽ� : "+ num%50000%10000%1000%100%50%10/1 +"��");
		
		sc.close();
	}

}

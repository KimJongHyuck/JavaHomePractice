package chapter2.practice.exercise;

import java.util.Scanner;

/*
 * 369������ ������ �ۼ��غ���.
 * 1~99������ ������ �Է¹ް� ������ 3,6,9�� �ϳ���
 * �ִ� ���� �ڼ�¦�� ����ϰ� �� ���� �ִ� ���� �ڼ�¦¦��
 * ����ϴ� ���α׷��� �ۼ��϶�.
 */
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ten,il;
		
		System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		
		ten = num/10;
		il = num%10;
		
		if(num != 0 && num <= 99) {
			
			if((ten == 3 || ten == 6 || ten == 9) && 
					(il == 3 || il == 6 || il == 9)) {
						System.out.println("�ڼ� ¦¦");
			}else if((ten == 3 || ten == 6 || ten == 9) || 
					(il == 3 || il == 6 || il == 9)) {
						System.out.println("�ڼ� ¦");
			}
		} else {
			System.out.println("������ ������ ������ϴ�.");
		}
		sc.close();
	}

}

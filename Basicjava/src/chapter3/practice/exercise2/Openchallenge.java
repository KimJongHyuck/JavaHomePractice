package chapter3.practice.exercise2;

import java.util.Random;
import java.util.Scanner;

//0~99���� ������ ���� ���� ī�带 ���� ����� �� ī���� ���� ���ߴ� ����.
//�� ���� �� ���� �ݺ��ϱ����� y/n�� �Է��ϰ� n�� ��� ����.
public class Openchallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		while (true) {
			int min = 0,max = 99,num = 0, cnt = 1;
			int k = r.nextInt(100); //0~99������ ������ ���� ����
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
			System.out.println(min+"~"+max);
			System.out.print(cnt+">>");
			num = sc.nextInt();
			
			while(k != num) {
				if(num > k) {
					System.out.println("�� �۰�");
					max = num;
				} else if(num < k) {
					System.out.println("�� ũ��");
					min = num;
				}
				cnt++;
				System.out.println(min+"~"+max);
				System.out.print(cnt+">>");
				num = sc.nextInt();
			}
			System.out.println("�¾ҽ��ϴ�.");
			System.out.println("�ٽ��Ͻðڽ��ϱ�?(y/n)");
			String text = sc.next();
			
			if(text.equals("n")) {
				break;
			} else if(text.equals("y")) {
				continue;
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}

		
		
	}

}

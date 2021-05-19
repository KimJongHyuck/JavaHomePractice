package chapter4.practice.exercise;

import java.util.Scanner;

class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
	
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	private Day days[];
	
	public MonthSchedule(int day) {
		this.days = new Day[day];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int answer = sc.nextInt();
			
			switch(answer) {
				case 1 :  
					input();
				break;
				case 2 :
					view();
				break;
				case 3 :
					finish();
				break;
			
				default :
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
			}
		}
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}

	public void view() {
		  System.out.print("��¥(1~30)?");
	      int day = sc.nextInt();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	         return;
	      }
	      System.out.print((day+1)+"���� �� ���� ");
	      days[day].show();
	}

	public void input() {
		System.out.print("��¥(1~30)?");
	      int day = sc.nextInt();
	      System.out.print("����(��ĭ�����Է�)?");
	      String work = sc.next();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	         return;
	      }
	      days[day].set(work);
	}
}

public class Q6 {

	public static void main(String[] args) {
		
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}

}

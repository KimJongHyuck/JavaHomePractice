package chapter4.practice.exercise;

import java.util.Scanner;

class Day1 {
	private String work;
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

class MonthSchedule1 {
	Scanner sc = new Scanner(System.in);
	Day1 days[];
	
	public MonthSchedule1(int day) {
		this.days = new Day1[day];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day1();
		}
		
	}
	
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		
		while(true) {
			System.out.println("����(�Է�:1, ����:2, ������:3) >>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
	
	public void input() {
		System.out.print("��¥(1~30)? ");
		int day = sc.nextInt();
		System.out.print("����(��ĭ�����Է�) : ");
		String work = sc.next();
		day--;
		if(day < 0 || day > 30) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		days[day].set(work);
	}
	
	public void view() {
		System.out.print("��¥?");
		int day = sc.nextInt();
		day--;
		if(day < 0 || day > 30) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			return;
		}
		
		System.out.print((day+1)+"���� �� ���� ");
	     days[day].show();
		
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}

public class Q6re {

	public static void main(String[] args) {
		
		MonthSchedule1 april = new MonthSchedule1(30);
		april.run();
		

	}

}

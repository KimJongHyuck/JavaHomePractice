package chapter4.practice.exercise;

import java.util.Scanner;

class Seat {

	private String seat[];
	
	public Seat() {
		seat = new String[10];
		for(int i =0; i<seat.length; i++) {
			seat[i] = "---";
		}
	}
	
	public void show() {
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void set(String name,int num) {
		seat[num-1] = name;
	}
	
	public boolean reSet(String name) {
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
				return true;
			}
		}
		return false;
	}
}

class Reservation {
	Scanner sc = new Scanner(System.in);
	private Seat[] s;
	private String seatGrade[] = {"S","A","B"};
	
	public Reservation() {
		s = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}
	
	public void reserve() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int selectNum = sc.nextInt();
		System.out.print(seatGrade[selectNum-1]+">>");
		s[selectNum-1].show();
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		s[selectNum-1].set(name, num);
	}
	
	public void check() {
		for(int i=0; i<s.length; i++) {
			System.out.print(seatGrade[i]+">>");
			s[i].show();
		}
		System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void cancel() {
		System.out.print("�¼� S:1, A:2 B:3 >>");
		int num = sc.nextInt();
		System.out.print(seatGrade[num-1]+">>");
		s[num-1].show();
		System.out.print("�̸�>>");
		String name = sc.next();
		boolean result = s[num-1].reSet(name);
		
		if(result == true) {
			System.out.println("��Ҹ� �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
		
	}
	
	public void run() {
		while(true) {
		
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
			case 1:
				reserve();
				break;
			case 2:
				check();
				break;
			case 3:
				cancel();
				break;
			case 4:
				return;
			}

		}
	}
}
	

public class Q12 {

	public static void main(String[] args) {
	
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Reservation r = new Reservation();
		r.run();

	}

}

package conditional;

import java.util.Scanner;

class Seat {
	private String seat[];
	private String name;
	private int seatNum;
	
	public Seat() {
		seat = new String[10];
		for(int i=0; i<seat.length; i++) {
			seat[i] = "---";
		}
	}
	
	public void show() {
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void set(String name, int num) {
		seat[num-1] = name;
	}
	
	public boolean reSet(String name) {
	
		for(int i=0; i<seat.length; i++) {
			if(seat[i].equals(name)) {
				seat[i] = "---";
				return true;
			}
		}
		return false;
	}
	
}

class reservation {
	Scanner sc = new Scanner(System.in);
	Seat seat[];
	String seatGrade[] = {"S","A","B"};
	
	public reservation() {
		seat = new Seat[3];
		for(int i=0; i<seat.length; i++) {
			seat[i] = new Seat();
		}
		
	}
	
	public  void reserve() {
		System.out.print("�¼� ���� S(1), A(2), B(3)>>");
		int selectNum = sc.nextInt();
		System.out.print(seatGrade[selectNum-1]+">>");
		seat[selectNum-1].show();
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int seatNum = sc.nextInt();
		seat[selectNum-1].set(name, seatNum);
	}
	
	public void view() {
		for(int i=0; i<seat.length; i++) {
			System.out.print(seatGrade[i]+">>");
			seat[i].show();
		}
		System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void cancel() {
		System.out.print("�¼� S:1, A:2, B:3>>");
		int selectNum = sc.nextInt();
		System.out.print(seatGrade[selectNum-1]+">>");
		seat[selectNum-1].show();
		System.out.print("�̸�:");
		String name = sc.next();
		seat[selectNum-1].reSet(name);
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
				view();
				break;
			case 3:
				cancel();
				break;
			case 4:
				break;
			}
		}
	}	
}

public class Q12 {

	public static void main(String[] args) {

		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		reservation r = new reservation();
		r.run();
		

	}

}

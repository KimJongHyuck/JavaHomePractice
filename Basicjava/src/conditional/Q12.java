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
		System.out.print("좌석 구분 S(1), A(2), B(3)>>");
		int selectNum = sc.nextInt();
		System.out.print(seatGrade[selectNum-1]+">>");
		seat[selectNum-1].show();
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int seatNum = sc.nextInt();
		seat[selectNum-1].set(name, seatNum);
	}
	
	public void view() {
		for(int i=0; i<seat.length; i++) {
			System.out.print(seatGrade[i]+">>");
			seat[i].show();
		}
		System.out.println("조회를 완료하였습니다.");
	}
	
	public void cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int selectNum = sc.nextInt();
		System.out.print(seatGrade[selectNum-1]+">>");
		seat[selectNum-1].show();
		System.out.print("이름:");
		String name = sc.next();
		seat[selectNum-1].reSet(name);
	}
	
	public void run() {
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
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

		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		reservation r = new reservation();
		r.run();
		

	}

}

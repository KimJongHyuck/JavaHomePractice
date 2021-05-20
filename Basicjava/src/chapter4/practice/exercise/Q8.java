package chapter4.practice.exercise;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int p_num = sc.nextInt();
		int i;
		Phone phone[] = new Phone[p_num];
		
		for(i=0; i<p_num; i++) {
			System.out.print("이름과 전화번호>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다..");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String searchName = sc.next();
			
			for(i=0; i<p_num; i++) {
				
				if(searchName.equals(phone[i].getName())) {
					System.out.println(searchName + "의 번호는" + phone[i].getTel());
					i--;
					break;
				} 
			}
			
			if(i == p_num) {
				System.out.println(searchName+" 이 없습니다.");
			}
			
			if(searchName.equals("그만")) {
				System.out.print("프로그램을 종료합니다.");
				System.exit(0);
			}
			
		}
		
	}

}

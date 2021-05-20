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
		
		System.out.print("�ο���>>");
		int p_num = sc.nextInt();
		int i;
		Phone phone[] = new Phone[p_num];
		
		for(i=0; i<p_num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�..");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String searchName = sc.next();
			
			for(i=0; i<p_num; i++) {
				
				if(searchName.equals(phone[i].getName())) {
					System.out.println(searchName + "�� ��ȣ��" + phone[i].getTel());
					i--;
					break;
				} 
			}
			
			if(i == p_num) {
				System.out.println(searchName+" �� �����ϴ�.");
			}
			
			if(searchName.equals("�׸�")) {
				System.out.print("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
		}
		
	}

}

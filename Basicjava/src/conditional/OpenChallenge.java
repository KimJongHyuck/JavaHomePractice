package conditional;

import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		
		System.out.print("ö��>>");
		String chulsu = sc.next();
		System.out.print("����>>");
		String younghee = sc.next();
		
		if(chulsu.equals("����")) {
			if(younghee.equals("����")) {
				System.out.println("�����ϴ�.");
			}else if(younghee.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}else if(younghee.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}else if(chulsu.equals("����")) {
			if(younghee.equals("����")) {
				System.out.println("ö���� �̰���ϴ�..");
			}else if(younghee.equals("����")) {
				System.out.println("�����ϴ�.");
			}else if(younghee.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}else if(chulsu.equals("��")) {
			if(younghee.equals("����")) {
				System.out.println("���� �̰���ϴ�..");
			}else if(younghee.equals("����")) {
				System.out.println("ö���� �̰���ϴ�..");
			}else if(younghee.equals("��")) {
				System.out.println("�����ϴ�..");
			}
		}
		
		
	}
}

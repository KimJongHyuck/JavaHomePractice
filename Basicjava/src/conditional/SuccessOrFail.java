package conditional;

import java.util.Scanner;

//���� ������ 80�� �̻��̶�� �հ� �Ǻ��� �ϴ� ���α׷��� �ۼ��϶�.
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�: ");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}
		sc.close();
		
		
	}
}

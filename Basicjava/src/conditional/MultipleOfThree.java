package conditional;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		
		int num = sc.nextInt();
		if (num % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
		
		
	}
}
package chapter3.practice.exercise2;

import java.util.Scanner;

//������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����)
//���� �迭�� �����ϰ�, �̰��� 1~100���� ������ ������ �ߺ����� ������ ���
//????
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �??");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*100+1);
			arr[i] = r;
			
			for(int j=0; j<i; j++) {
				if(arr[j] == r) {
					i--;
					break;
				}
			}
		}
		
		int line = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			line++;
			if(line == 10) {
				System.out.println();
				line = 0;
			}
			
		}
		
	}

}

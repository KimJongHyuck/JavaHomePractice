package chapter3.practice.exercise2;

import java.util.Scanner;

//��ĳ�� �̿� �ҹ��� ���ĺ��� �Է¹ް� 
// e�� �Է¹޾��� ���
// abcde
// abcd
// abc
// ab
// a
//�� ���
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = sc.next();
		char c = s.charAt(0);//���ڿ��� ù��° ����
		
		System.out.println(c-'a');
		for(int i = 0; i<=c-'a'; i++) {
	         for(char j = 'a'; j<= c-i; j++) {
	            System.out.print(j);
	         }
	         System.out.println();
	      }
	      
	      sc.close();
	   

	}

}

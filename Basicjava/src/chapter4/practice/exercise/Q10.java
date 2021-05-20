package chapter4.practice.exercise;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String [] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		int i=0;
		for(i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
	
}

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = sc.next();
			
			if(word.equals("�׸�")) {
				break;
			}
			String result = Dictionary.kor2Eng(word);
			
			if(result == null) {
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			} else {
				System.out.println(word+"��" + Dictionary.kor2Eng(word));
			}	
		}
	}

}

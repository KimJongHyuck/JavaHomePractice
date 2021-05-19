package chapter4.practice.exercise;

import java.util.Scanner;

class Player {
	String name;
	String word;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void sayWord(String word) {
		this.word = word;
	}
	
	public void getWordFromUser() {
		Scanner sc2 = new Scanner(System.in);
		System.out.printf("%s>>",this.name);
		this.word = sc2.nextLine();
	}
	
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length()-1 ;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = word.charAt(0);
		if(firstChar == lastChar)
			return true;
		else
			return false;
	}
	
}
public class WordGameApp {

	public static void run () {
		Scanner sc = new Scanner(System.in);
		String lastWord = "�ƹ���";
		System.out.println("�����ձ� ������ �����մϴ�..");
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int p_num = sc.nextInt();
		Player p[] = new Player[p_num]; //player Ŭ������ �Է¹��� ����ŭ �迭�� ����
		
		for(int i=0; i<p.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = sc.next(); //�������̸� �Է�
			p[i] = new Player(name); //�迭 ������� �̸��� �Ҵ�
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		while(true) {
			for(int i=0; i<p_num; i++) {
				String name = p[i].name; // �÷��̾� �̸�
				System.out.print(name+">>");
				p[i].sayWord(sc.next());
				if(p[i].checkSuccess(lastWord) == true) { //�޼ҵ� ���ప�� ���̸�
					lastWord = p[i].word; // �������ܾ word�� �Ҵ�
				}
				else {
					System.out.println(name + "�� �����ϴ�.");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		WordGameApp.run();//static���� ���� run�޼ҵ� ����

	}

}

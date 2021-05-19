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
		String lastWord = "아버지";
		System.out.println("끝말잇기 게임을 시작합니다..");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int p_num = sc.nextInt();
		Player p[] = new Player[p_num]; //player 클래스를 입력받은 수만큼 배열로 생성
		
		for(int i=0; i<p.length; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = sc.next(); //참가자이름 입력
			p[i] = new Player(name); //배열 순서대로 이름을 할당
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		while(true) {
			for(int i=0; i<p_num; i++) {
				String name = p[i].name; // 플레이어 이름
				System.out.print(name+">>");
				p[i].sayWord(sc.next());
				if(p[i].checkSuccess(lastWord) == true) { //메소드 실행값이 참이면
					lastWord = p[i].word; // 마지막단어를 word에 할당
				}
				else {
					System.out.println(name + "이 졌습니다.");
					System.exit(0);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		WordGameApp.run();//static으로 만든 run메소드 실행

	}

}

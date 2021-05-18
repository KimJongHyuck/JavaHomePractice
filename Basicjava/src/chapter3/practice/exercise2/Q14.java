package chapter3.practice.exercise2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String course [] = { "java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목이름>>");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.print("종료합니다.");
				break;
			}
			int i = 0;
			for(i=0; i<course.length; i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(name + "의 점수는" + n);
					break;
				} 
			}
			
			if(i==score.length) // 과목명이 잘못된 경우 위 if문을 통과후 배열의 길이와 같아지면
				System.out.println("없는 과목입니다.");		
		}
		
		sc.close();
	}
}

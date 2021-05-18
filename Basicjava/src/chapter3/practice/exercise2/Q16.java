package chapter3.practice.exercise2;

import java.util.Scanner;

//컴퓨터와 가위바위 보 게임을 만들어보자.
//그만을 입력하면 종료
//
public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보!!>>");		
			String answer = sc.next();
			
			if(answer.equals("그만")) {
				System.out.println("게임을 종료합니다..");
				break;
			} 
			
			if(str[n].equals("가위")) {
				if(answer.equals("가위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
										+ str[n] + " 비겼습니다.");
				} else if(answer.equals("바위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 사용자가 이겼습니다.");
				} else if(answer.equals("보")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 사용자가 졌습니다.");
				}
			}
			
			if(str[n].equals("바위")) {
				if(answer.equals("가위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
										+ str[n] + " 사용자가 졌습니다..");
				} else if(answer.equals("바위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 비겼습니다.");
				} else if(answer.equals("보")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 사용자가 이겼습니다..");
				}
			}
			
			if(str[n].equals("보")) {
				if(answer.equals("가위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
										+ str[n] + " 사용자가 이겼습니다.");
				} else if(answer.equals("바위")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 사용자가 졌겼습니다.");
				} else if(answer.equals("보")) {
					System.out.println("사용자 = " + answer + ", 컴퓨터 = " 
							+ str[n] + " 비겼습니다.");
				}
			}
		}
		sc.close();	
	}

}

package chapter3.practice.exercise2;

import java.util.Scanner;

//스캐너 이용 소문자 알파벳을 입력받고 
// e를 입력받았을 경우
// abcde
// abcd
// abc
// ab
// a
//로 출력
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = sc.next();
		char c = s.charAt(0);//문자열의 첫번째 문자
		
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

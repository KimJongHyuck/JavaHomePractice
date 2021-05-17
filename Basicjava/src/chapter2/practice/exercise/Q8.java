package chapter2.practice.exercise;

import java.util.Scanner;

//직사각형을 구현하는 두 점(x1, y1) (y1,y2)를 입력받아 (100,100),(200,200)의
//두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x1,y1) , (x2,y2)를 입력하세요>>");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		if((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
			System.out.println("사각형이 충돌함");
		} else if((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)) {
			System.out.println("사각형이 충돌함");
		} else if((x1 <= 100 && x2 >= 200) && (y1 <= 100 && y2 >= 200)) {
			System.out.println("사각형이 충돌함");
		} else {
			System.out.println("사각형이 충돌하지 않습니다.");
		}

		sc.close();
		

		
	}

}

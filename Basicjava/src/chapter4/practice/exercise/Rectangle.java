package chapter4.practice.exercise;

import java.util.Scanner;

//너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램을 작성하라.
//너비와 높이 필드, 면적값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용.
public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle(); //객체 생성
		
		System.out.print(">>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 "+ rect.getArea());
		sc.close();

	}

}

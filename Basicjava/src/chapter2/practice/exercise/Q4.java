package chapter2.practice.exercise;
//정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력.
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수 3개 입력>>");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b<a && a<c) {
			System.out.println("중간값은 "+ a + "입니다.");
		}else if(a<b && b<c) {
			System.out.println("중간값은 "+ b + "입니다.");
		
		}else {
			System.out.println("중간값은 " + c + "입니다.");
		}
		sc.close();

	}

}

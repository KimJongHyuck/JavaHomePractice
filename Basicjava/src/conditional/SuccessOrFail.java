package conditional;

import java.util.Scanner;

//시험 점수가 80점 이상이라면 합격 판별을 하는 프로그램을 작성하라.
public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = sc.nextInt();
		if(score >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		}
		sc.close();
		
		
	}
}

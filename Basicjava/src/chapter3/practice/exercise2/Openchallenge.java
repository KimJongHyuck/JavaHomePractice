package chapter3.practice.exercise2;

import java.util.Random;
import java.util.Scanner;

//0~99까지 임의의 수를 가진 카드를 한장 숨기고 이 카드의 수를 맞추는 게임.
//더 높게 더 낮게 반복하기위해 y/n을 입력하고 n인 경우 종료.
public class Openchallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		
		while (true) {
			int min = 0,max = 99,num = 0, cnt = 1;
			int k = r.nextInt(100); //0~99까지의 임의의 정수 생성
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println(min+"~"+max);
			System.out.print(cnt+">>");
			num = sc.nextInt();
			
			while(k != num) {
				if(num > k) {
					System.out.println("더 작게");
					max = num;
				} else if(num < k) {
					System.out.println("더 크게");
					min = num;
				}
				cnt++;
				System.out.println(min+"~"+max);
				System.out.print(cnt+">>");
				num = sc.nextInt();
			}
			System.out.println("맞았습니다.");
			System.out.println("다시하시겠습니까?(y/n)");
			String text = sc.next();
			
			if(text.equals("n")) {
				break;
			} else if(text.equals("y")) {
				continue;
			} else {
				System.out.print("잘못 입력하셨습니다.");
			}
			
		}

		
		
	}

}

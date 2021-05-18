package chapter3.practice.exercise2;
//반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자.
//1부터 시작하여 99까지 출력.
public class Q13 {

	public static void main(String[] args) {
	
		int ten,il =0;
		for(int i=1; i<=100; i++) {
			ten = i%10;
			il = i/10;
			
			if((ten == 3 || ten == 6 || ten == 9) && 
					(il == 3 || il == 6 || il == 9)) {
				System.out.println(i+" 박수 짝짝");
			} else if((ten == 3 || ten == 6 || ten == 9) &&
					(il != 3 || il != 6 || il != 9)) {
				System.out.println(i+" 박수 짝");
			} else if((ten != 3 || ten != 6 || ten != 9) &&
					(il == 3 || il == 6 || il == 9)) {
				System.out.println(i+" 박수 짝");
			}
		}

	}

}

package chapter3.practice.exercise2;
//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//배열에 든 숫자들과 평균을 출력
public class Q7 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int sum = 0;
		System.out.print("랜덤한 정수들 : ");
		
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*10 + 1);
			arr[i] = r;
			sum += r;
			System.out.print(r + " ");
		}
		System.out.println();
		System.out.print("평균은 " + (double)sum/arr.length);
		
		
	}

}

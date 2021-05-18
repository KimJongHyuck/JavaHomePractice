package chapter3.practice.exercise2;
// 4x4의 2차원 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를
//배열에 저장하고, 2차원 배열을 화면에 출력하라.
public class Q9 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int r = (int)(Math.random()*10+1);
				arr[i][j] = r;		
				}
			}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}

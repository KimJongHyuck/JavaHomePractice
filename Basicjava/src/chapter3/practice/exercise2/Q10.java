package chapter3.practice.exercise2;
// 4x4의 2차원 배열을 만들고 1~10까지 범위의 정수를 10개만 랜덤하게 생성하여
//임의의 위치에 삽입. 동일한 정수가 있어도 상관없다.
//나머지 6개의 숫자는 모두 0이다.
public class Q10 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];//배열 생성
		int x,y,result = 0;//x,y는 배열위치 랜덤값, result는 랜덤 생성 개수
		
		while(result < 10) {
			x=(int)(Math.random()*4);//x에 0~4까지 랜덤 수 넣기
			y=(int)(Math.random()*4);
			if(arr[x][y] == 0) { // 랜덤 위치에 값이 0일 경우
				arr[x][y] = (int)(Math.random()*10+1); // 그위치에 랜덤 수넣기
				result++; // 랜덤 생성 개수 +시킴.
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

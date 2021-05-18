package Array;
//2차원 배열에 학년별로 1,2학기 성적으로저장하고, 4년간 전체 평점 평균을 출력하라.
public class ArrayEx3 {
	public static void main(String[] args) {
		
		Double score[][] = {{3.3,3.4},//1학년 1,2학기 평점
				            {3.5,3.6},
				            {3.7,4.0},
				            {4.1,4.2},
							};
		double sum = 0;
		for(int year=0; year<score.length; year++) { //각 학년별로 반복
			for(int term=0; term<score[year].length; term++) { //학기별로 반복
				sum += score[year][term]; // 전체 평점 합
			}
		}
		
		int n = score.length; // 배열의 행 개수
		int m = score[0].length; // 배열의 열 개수
		System.out.println("4학년 전체 평점 평균은 " + sum/(n*m));
	}
}

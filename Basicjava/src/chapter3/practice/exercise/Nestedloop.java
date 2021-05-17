package chapter3.practice.exercise;

public class Nestedloop {

	public static void main(String[] args) {
		
//		 for (int i = 4; i > 0; i--) { //줄을 생성하면서 빈칸 하나씩 줄어들게 하기
//	            for (int j = 0; j < i; j++) { //j가 빈칸(i)보다 작으면 
//	                System.out.print("*"); //공백 출력
//	            }
//	            System.out.println();
//	        }
		 
		 
		 for(int i = 5; i > 0; i--) {
			 for (int j = 0; j < i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}

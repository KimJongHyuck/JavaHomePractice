package chapter3.practice.exercise;

public class Nestedloop {

	public static void main(String[] args) {
		
//		 for (int i = 4; i > 0; i--) { //���� �����ϸ鼭 ��ĭ �ϳ��� �پ��� �ϱ�
//	            for (int j = 0; j < i; j++) { //j�� ��ĭ(i)���� ������ 
//	                System.out.print("*"); //���� ���
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

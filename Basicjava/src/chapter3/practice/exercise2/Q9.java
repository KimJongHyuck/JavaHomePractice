package chapter3.practice.exercise2;
// 4x4�� 2���� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� ���� 16����
//�迭�� �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�.
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

package chapter3.practice.exercise2;
// 4x4�� 2���� �迭�� ����� 1~10���� ������ ������ 10���� �����ϰ� �����Ͽ�
//������ ��ġ�� ����. ������ ������ �־ �������.
//������ 6���� ���ڴ� ��� 0�̴�.
public class Q10 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];//�迭 ����
		int x,y,result = 0;//x,y�� �迭��ġ ������, result�� ���� ���� ����
		
		while(result < 10) {
			x=(int)(Math.random()*4);//x�� 0~4���� ���� �� �ֱ�
			y=(int)(Math.random()*4);
			if(arr[x][y] == 0) { // ���� ��ġ�� ���� 0�� ���
				arr[x][y] = (int)(Math.random()*10+1); // ����ġ�� ���� ���ֱ�
				result++; // ���� ���� ���� +��Ŵ.
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

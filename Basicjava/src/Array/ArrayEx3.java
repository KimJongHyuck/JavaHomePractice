package Array;
//2���� �迭�� �г⺰�� 1,2�б� �������������ϰ�, 4�Ⱓ ��ü ���� ����� ����϶�.
public class ArrayEx3 {
	public static void main(String[] args) {
		
		Double score[][] = {{3.3,3.4},//1�г� 1,2�б� ����
				            {3.5,3.6},
				            {3.7,4.0},
				            {4.1,4.2},
							};
		double sum = 0;
		for(int year=0; year<score.length; year++) { //�� �г⺰�� �ݺ�
			for(int term=0; term<score[year].length; term++) { //�б⺰�� �ݺ�
				sum += score[year][term]; // ��ü ���� ��
			}
		}
		
		int n = score.length; // �迭�� �� ����
		int m = score[0].length; // �迭�� �� ����
		System.out.println("4�г� ��ü ���� ����� " + sum/(n*m));
	}
}

package chapter3.practice.exercise2;
//������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�.
//�迭�� �� ���ڵ�� ����� ���
public class Q7 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int sum = 0;
		System.out.print("������ ������ : ");
		
		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*10 + 1);
			arr[i] = r;
			sum += r;
			System.out.print(r + " ");
		}
		System.out.println();
		System.out.print("����� " + (double)sum/arr.length);
		
		
	}

}

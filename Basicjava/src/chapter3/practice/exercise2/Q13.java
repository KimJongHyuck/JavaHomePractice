package chapter3.practice.exercise2;
//�ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ��츦 ������� ȭ�鿡 ����غ���.
//1���� �����Ͽ� 99���� ���.
public class Q13 {

	public static void main(String[] args) {
	
		int ten,il =0;
		for(int i=1; i<=100; i++) {
			ten = i%10;
			il = i/10;
			
			if((ten == 3 || ten == 6 || ten == 9) && 
					(il == 3 || il == 6 || il == 9)) {
				System.out.println(i+" �ڼ� ¦¦");
			} else if((ten == 3 || ten == 6 || ten == 9) &&
					(il != 3 || il != 6 || il != 9)) {
				System.out.println(i+" �ڼ� ¦");
			} else if((ten != 3 || ten != 6 || ten != 9) &&
					(il == 3 || il == 6 || il == 9)) {
				System.out.println(i+" �ڼ� ¦");
			}
		}

	}

}

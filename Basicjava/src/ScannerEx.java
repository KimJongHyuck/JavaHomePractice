import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ����"
				+ " �и��Ͽ� �Է��ϼ���.");
		
		String name = sc.next();//���ڿ� �б�
		System.out.print("�̸��� " + name + ", ");
		
		String city = sc.next();//���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		
		int age = sc.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = sc.nextDouble();
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean isSingle = sc.nextBoolean();
		System.out.print("���ſ��δ� " + isSingle + "�Դϴ�.");
		
		
		
	}

}

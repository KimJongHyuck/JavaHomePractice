package chapter5.practice.exercise;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; //����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		sc.close();
	}
	
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double ratio) {
		this.ratio =  ratio;
		
	}
	
	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "��";
	}

	@Override
	protected String getDestString() {
		
		return "�޷�";
	}
}

class Km2Mile extends Converter {
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "Km";
	}

	@Override
	protected String getDestString() {
		
		return "mile";
	}
}

public class Q3 {

	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200); //1�޷��� 1200��
//		toDollar.run();

		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
		
	}

}

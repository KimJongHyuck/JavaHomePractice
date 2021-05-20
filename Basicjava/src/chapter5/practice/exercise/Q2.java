package chapter5.practice.exercise;

class TV2 {
	private int size;
	
	public TV2(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
	
}

class ColorTV2 extends TV {

	private int color;
	
	public ColorTV2(int size,int color) {
		super(size);
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.print(getSize()+"인치 "+color+"컬러");
	}
}

class IPTV extends ColorTV2 {
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}

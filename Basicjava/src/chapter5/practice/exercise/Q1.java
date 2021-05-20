package chapter5.practice.exercise;

class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
	
}

class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.print(getSize()+"인치 "+color+"컬러");
	}
}

public class Q1 {

	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}

}

package chapter4.practice.exercise;

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	public Song(String title,String artist,int year,String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.print(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}

public class Q3 {

	public static void main(String[] args) {
		
		Song song = new Song("Dancing Queen","ABBA",1978,"������");
		song.show();

	}

}

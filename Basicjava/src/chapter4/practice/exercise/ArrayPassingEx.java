package chapter4.practice.exercise;
//char[] 배열을 전달받아 출력하는 printCharArray() 메소드와
//배열 속의 공백 문자를 , 로 대치하는 replaceSpace() 메소드를 작성하라.
public class ArrayPassingEx {

	static void replaceSpace(char a[]) { // 배열 a의 공백문자를 ','로 변경
		for(int i = 0; i <a.length; i++) {
			if(a[i] == ' ') { // 공백 문자를 ','로 변경
				a[i] = ',';
			}
		}
	}
	
	static void printCharArray(char a[]) { //배열 a의 문자들을 화면에 출력
		for(int i = 0; i <a.length; i++) {
			System.out.print(a[i]);// 배열 원소 문자 출력
		}
		System.out.println(); //배열 원소 출력후 줄바꿈
	}
	
	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n',
					'c','i','l','.'};
		printCharArray(c);//원래 배열 원소 출력
		replaceSpace(c); //공백 문자 바꾸기
		printCharArray(c);//수정된 배열 원소 출력
		
		
	}

}

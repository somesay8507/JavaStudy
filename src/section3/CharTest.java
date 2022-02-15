package section3;

public class CharTest {
	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); //정수 출력
		
		ch = 66;
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int ch2 = 67;
		System.out.println(ch2); //문자 자료형이 출력안되고, 정수값 출력!
	}
}

package section3;

/* 변수
 * 프로그램에서 사용되는 자료를 저장하기 위한 공간
 * 할당 받은 메모리의 주소 대신 부르는 이름
 * 프로그램 실행 중에 값 변경 가능
 * 사용되기 이전에 선언 되어야 한다
 */

 /* 변수의 선언과 초기화
  * ex) int level;  => level 이라는 이름의 변수 서언
  *     int level = 0;  => level 변수 선언과 동시에 0 으로 초기화
  *     int level;
  *     level = 10;
  *     
  *     =>정리 : int의 역할: level 변수의 데이터 타입을 저의
  *             int의 의미: level은 정수이며 4바이트의 메모리 공간을 사용함.
  */

/* 변수 선언 시 유의점
 * 변수의 이름 알파벳, 숫자,_,$로 구성
 * 대소문자를 구분
 * 변수의 이름은 숫자로 시작할 수 없고, 키워드도 변수의 이름으로 사용할 수 없다.
 * 이름 사이에 공백이 있을 수 없다.
 * 변수의 이름을 정할 때는 변수의 역할에 어울리는, 의미 있는 이름을 지어야 한다.
 * 예약어는 변수로 사용할 수 없다.
 * 
 */

public class VariableTest {

	public static void main(String[] args) {
		int num;
		num = 10;
		
		System.out.println(num);
		
		int level = 20;
		System.out.println(level);
	}
}

package section4;

public class OperationEx3 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = (((num1 = num1 + 10) < 10) && ((i = i + 2) > 10));
		// 1.value = 첫번째 ()안에 항이 false이기 때문에  뒤에껀 연산하지 않음.
		// 2.value -> false , num1은 증가한 값이 20 이고, i는 증가되지 않았다.(연산이 안되기 때문에)
		// 즉, value는false이고, num1 = 20이고, i는 증가 되지 않았음
		//boolean value = (((num1 = num1 + 10) > 10) && ((i = i + 2) > 10));
		//  ㄴ> 반대로 true 이기 때문에 왼쪽, 오른쪽 연산해서 출력함
		//  ㄴ> 앞 뒤 모두가 true 이면, 앞 뒤로 연산하고, 앞이 false이면 뒤에껀 무시
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}

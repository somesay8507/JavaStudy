package section4;

public class OperationEx5 {

	public static void main(String[] args) {
		
	    /*	
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 | num2;
		System.out.println(result);
	     */
		
		int num3 = 5; //5 = 00000101
		System.out.println(num3 << 1); //<<=비트연산자랑 같이 사용 
		System.out.println(num3);
		System.out.println(num3 << 2);
		System.out.println(num3 << 3);
		
		System.out.println(num3 >> 1); //5>>00000010 
		//오른쪽 밀면 곱하기 2의 n승 이고, 왼쪽으로 밀면 나누기 2의 n승

	}

}

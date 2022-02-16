package section3;

public class ExplicitConversion {
 //명시적 형변환
	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		/*소숫점 이하는 다 사라지고 정수 부분만 출력하게된다.
		 즉, 소수점 유실되도 상관 없다.
		 */
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; 
		//dNum + fnum 더하기전에 int로 변환
		// dnum(3) fNum 0.9을 int로 변환하게되면 0이고, 3 + 0 을 더하게되면 3이기 때문에 num1값은 3으로 출력
		int num2 = (int)(dNum + fNum);
		//dNum(3.14) + fNum(0.9) = 4.23 값을 int 변환하면 4이기때문에 num2값은 4로 출력
		System.out.println(num1);
		System.out.println(num2);
		
	}

}

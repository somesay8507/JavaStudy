package section3;

public class ExplicitConversion {
 //����� ����ȯ
	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		/*�Ҽ��� ���ϴ� �� ������� ���� �κи� ����ϰԵȴ�.
		 ��, �Ҽ��� ���ǵǵ� ��� ����.
		 */
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; 
		//dNum + fnum ���ϱ����� int�� ��ȯ
		// dnum(3) fNum 0.9�� int�� ��ȯ�ϰԵǸ� 0�̰�, 3 + 0 �� ���ϰԵǸ� 3�̱� ������ num1���� 3���� ���
		int num2 = (int)(dNum + fNum);
		//dNum(3.14) + fNum(0.9) = 4.23 ���� int ��ȯ�ϸ� 4�̱⶧���� num2���� 4�� ���
		System.out.println(num1);
		System.out.println(num2);
		
	}

}

package section3;

public class ImplicitConversion {
  //형변환
	public static void main(String[] args) {
	byte bNum = 10;
	int num = bNum;
	
	System.out.println(num);
	
	long lNum = 10;
	float fNum = lNum;
	
	System.out.println(fNum);
	
	double dNum = fNum + num;
	System.out.println(dNum);
   //적은 메모리가 큰 메모리로 변환 된다!
	}

}

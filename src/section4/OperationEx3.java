package section4;

public class OperationEx3 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = (((num1 = num1 + 10) < 10) && ((i = i + 2) > 10));
		// 1.value = ù��° ()�ȿ� ���� false�̱� ������  �ڿ��� �������� ����.
		// 2.value -> false , num1�� ������ ���� 20 �̰�, i�� �������� �ʾҴ�.(������ �ȵǱ� ������)
		// ��, value��false�̰�, num1 = 20�̰�, i�� ���� ���� �ʾ���
		//boolean value = (((num1 = num1 + 10) > 10) && ((i = i + 2) > 10));
		//  ��> �ݴ�� true �̱� ������ ����, ������ �����ؼ� �����
		//  ��> �� �� ��ΰ� true �̸�, �� �ڷ� �����ϰ�, ���� false�̸� �ڿ��� ����
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}

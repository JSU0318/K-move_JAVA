package array;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		//���� �ʱ�ȭ ���� ����
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			//�迭�� ��ҿ� ���� ������ ����
			//alphabets
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + "/" + (alphabets[i]));
		}

	}

}

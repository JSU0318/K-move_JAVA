package array;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		//문자 초기화 변수 선언
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			//배열의 요소에 문자 값으로 변경
			//alphabets
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + "/" + (alphabets[i]));
		}

	}

}

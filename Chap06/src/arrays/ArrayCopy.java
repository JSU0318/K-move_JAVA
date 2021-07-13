package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = new int[] { 10, 20, 30, 40, 50 };
		int[] array2 = new int[] {1, 2, 3, 4, 5} ;
		
		System.arraycopy(array1, 0, array2, 1, 3);
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]); // 대상 배열의 요소 값 확인
		}

	}

}

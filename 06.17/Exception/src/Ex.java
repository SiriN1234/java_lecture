
public class Ex {
	int[] arr = {1, 2, 3, 4, 5};
	
	public void printAllElement() {
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public void printOneElement(int num) {
		// 예외처리하고 정상 범위 알려주기
		try {
			System.out.println(arr[num - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1~" + arr.length + " 사이의 정수를 입력하세요");
		}
	}
}

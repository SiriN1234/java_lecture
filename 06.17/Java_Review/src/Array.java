
public class Array {
	// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고
	// 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	// 예를 들어, 서로 다른 9개의 자연수
	// 3, 29, 38, 12, 57, 74, 40, 85, 61
	// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	
	// 입력 : 9개의 자연수가 들어있는 배열
	// 리턴 : 없음
	// 본문 : 최대값과 몇 번째인지 로그로 출력
	// 함수명 : printMaxValIdx
	
//	public void printMaxValIdx(int[] arr) {
//		int temp = 0;
//		int index = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(temp < arr[i]) {
//				temp = arr[i];
//				index = i;
//			}
//		}
//		
//		System.out.println("최댓값은 " + temp +"이고 " + (index + 1) + "번째 값입니다.");
//	}
	
	public void printMaxValIdx(int arr[]) {
		int max = 0;
		int count = 0;
		int index = 0;
		for(int ele : arr) {
			count++;
			if(ele > max) {
				max = ele;
				index = count;
			}
		}
		System.out.println("최댓값은 " + max +"이고 " + index + "번째 값입니다.");
	}
}

import java.util.Arrays;

public class ProcessNumber {
	// input : 숫자가 담긴 배열, 자를 자릿수
	// 본문 : 배열의 첫 번째 요소부터, 자를 자릿 수 만큼의 수를 모든 합친 수를 출력
	// 예) 123456, 3 -> 1+2+3 = 6
	// 함수명 : PrintCuttedSum
	
	public void printCuttedSum(int[] num, int cut) {
		int sum = 0;
		for(int i = 0; i <= (cut - 1); i++) {
			sum += num[i];
			if(i == (cut - 1))
				System.out.printf("%d ",num[i]);
			else
				System.out.printf("%d + ", num[i]);
		}
		
		System.out.println(" = " + sum);
	}
	
	// 인트형 배열 안에서 기준 숫자 이상인 엘리먼트(요소 = 값 하나)와
	// 기준 숫자 미만인 엘리먼트 2개로 나눠서 각각 모든 요소를 오름차순으로 출력해보세요.
	// 예) [1, 2, 3, 5, 7, 80, 150, 2022, 30534]
	// 기준이 100이라면
	// [1, 2, 3, 5, 7, 80]
	// 150, 2022, 30534]로 나뉨
	// 함수이름 : divideArrbyNum(인트형 배열, 인트형 숫자)
	
	public void divideArrbyNum(int[] arr, int standard) {
		Arrays.sort(arr);
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= standard) {
				cnt = i - 1;
				break;
			}
		}
		
		int[] biggerThanS = new int[cnt];
		int[] smallerThanS = new int[arr.length - cnt];
		
		for(int i = 0; i < cnt; i++) {
			biggerThanS[i] = arr[cnt + i + 1];
		}
		
		
		for(int i = 0; i < arr.length - cnt; i++) {
			smallerThanS[i] = arr[i];
		}
		
		System.out.println("기준보다 작은 배열 : " + Arrays.toString(smallerThanS));
		System.out.println("기준보다 큰 배열 : " + Arrays.toString(biggerThanS));
		
	}
	
}

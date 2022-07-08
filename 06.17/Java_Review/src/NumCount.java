
public class NumCount {
	// 세 개의 자연수 A, B, C가 주어질 때
	// A * B * C를 계산한 결과에 각각의 숫자가 몇 번씩 쓰였는지를 구하는 함수를 작성하시오
	// 예를 들어 A = 150, ㅠ = 266, ㅊ = 427dlfkaus
	// A * B * C = 150 * 266 * 427 = 17037300이 되고,
	// 계산한 결과 17037300에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	
	// input : 정수 3개
	// return : void
	// 본문 : 쓰여진 숫자 : 쓰여진 갯수를 다 출력
	
	public void numCount(int n1, int n2, int n3) {
		int result = n1 * n2 * n3;
		int cnt = 0;
		String numString = Integer.toString(result);
		
		System.out.printf("계산한 결과 %d에는 ", result);
		
		for(int i = 0; i < 10; i++) { // 0부터 9까지 10진수 숫자를 각각 검사
			for(int j = 0; j < numString.length(); j++) { // 곱한 수 전체 길이에 대해서 검사
//				if((numString.charAt(j) + "").equals(i + "")) {
				if(numString.charAt(j) == (char)(i + '0'
						)) {
					cnt++;
				}
			}
			
			if(cnt > 0) {
				System.out.printf(i + "이(가) " + cnt + "번, ");
				cnt = 0;
			}
			
		}
		
		System.out.println("쓰였다.");

		
//		int[] count = new int[10]; // 각각의 숫자가 몇 번 들어가 있는지 저장할 용도
//		while(result > 0) {
//			int i = 0;
//			i = result % 10; // 예) 1703 % 10 = 몫이 170 나머지가 3. 3이 리턴
//			count[i]++; // 그 수의 갯수 증가
//			result = result / 10; // 다음에 검사할 원천 데이터도 10으로 나누기
//		}
//		
//		for(int i = 0; i < count.length; i++) {
//			if(count[i] == 0) {
//				continue;
//			}
//			
//			System.out.printf("%d는 %d번 사용되었음\n", i, count[i]);
//		}
		
	}
}

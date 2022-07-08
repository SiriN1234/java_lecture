
public class recursion {
	
	// 인자로 받은 숫자까지 1씩 증가하는 모든 수를 더한 수를 리턴하는 함수를 만들자
	// 예) 함수(3) = 1 + 2 + 3 = 6
	//	  함수(5) = 1 + 2 + 3 + 4 + 5 = 15
	// 단, 반복문은 쓰면 안된다	
	
	static int addSum = 0;
	static int mul = 0;
	static int mulSum = 1;
	
	public int recursionSum(int inputNum) {
		
		addSum += inputNum;
		
		if(inputNum < 0) {
			System.out.println("양수를 입력하세요");
			return 0;
		} else {
		
		if(inputNum > 1) {
			System.out.printf("%d + ", inputNum);
			return recursionSum((inputNum -1));
		}
		else if(inputNum == 1) {
			System.out.printf("%d ", inputNum);
			return recursionSum((inputNum -1));
		}
		else {
			System.out.printf("= %d\n", addSum);
			return addSum;
		}
		}
	}
	
	
	// 응용문제
	// 1부터 인자로 받은 수 까지를 모두 곱한 수를 리턴하는 함수를 만들자
	// 예) 함수(2) = 2 * 1 = 2
	//    함수(3) = 3 * 2 * 1 = 6
	
	public int recursionMul(int inputNum) {
		mulSum *= inputNum;
		
		if(inputNum < 0) {
			System.out.println("양수를 입력하세요");
			return 0;
		} else {
		
		if(inputNum > 1) {
			System.out.printf("%d * ", inputNum);
			return recursionMul((inputNum -1));
		}
		else if(inputNum == 1) {
			System.out.printf("%d = %d\n", inputNum, mulSum);
			return mulSum;
		}
		else {
			return 0;
			
		}
	}
	}
	
}

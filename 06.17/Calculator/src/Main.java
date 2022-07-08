
public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(2, 5));
		System.out.println(cal.minus(2, 5));
		System.out.println(cal.multiple(2, 5));
		System.out.println(cal.divide(2, 5));
		
		System.out.println(cal.add(2.5, 7.5)); // 문법 에러 -> 오버로드
		System.out.println(cal.divide(3, 0));
		
		// 나누기가 이상하다.
		// 실수끼리 사칙연산을 할 수가 없다.
			// 현재 문법 에러. The method add(int, int) in the type Calculator
		// 나누기에서 0을 쓰면 프로그램이 터짐.
			// 자바에서 0으로 나누기 하는 법 : 잘못된 구글링
			// arithmeticEception /by zero가 무엇인지 알고 고치는 법 : 좋은 구글링
			// 에러로그를 구글링해서 고쳐보기
		
		System.out.println(cal.getOnlyQuotient(107.5, 50.3));
		System.out.println(cal.getOnlyQuotient(107, 0));
		System.out.println("hello");
		
	}

}

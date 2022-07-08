
public class Main {

	public static void main(String[] args) {
		
		recursion re = new recursion();
		
		System.out.println(re.recursionSum(100));
		System.out.println(re.recursionMul(6));
		
		
		figure cal1 = new equilTriangle(3.0, 4.0);
		figure cal2 = new square(3.0, 4.0);
		figure cal3 = new circle(3.0, 4.0);
		
		System.out.println(cal1.calcArea());
		System.out.println(cal1.calcRound());
		
		System.out.println(cal2.calcArea());
		System.out.println(cal2.calcRound());
		
		System.out.println(cal3.calcArea());
		System.out.println(cal3.calcRound());
		
		// stack overflow
		// 나중에 들어간게 먼저 나온다
		// 제일 최근에 호출된 함수의 리턴 값이 먼저 계산되어야 한다
		// 하나가 끝나기 전에 새로운 하나가 호출되고 그것을 처리하기 전에 또 새로운 것이 호출되고
		// 이게 끝없이 진행되어서 스택 오버 플로우가 발생한다
	}

}

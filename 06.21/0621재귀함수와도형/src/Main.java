
public class Main {

	public static void main(String[] args) {
//		재귀함수 재귀 = new 재귀함수();
//		int result = 재귀.sigma(100);
//		
//		int facResult = 재귀.factorial(5);
//		System.out.println(facResult);
		
		//나중에 들어간게 먼저 나온다.
		//제일 최근에 호출된 함수의 리턴값이 먼저 계산되어야 한다.
		//하나가 끝나기전에 새로운 하나가 호출되고 그놈을 처리하기전에 또 새로운놈이 호출되고
		//이게 끝없이 진행되어서 스택 오버 플로우가 발생(스택이 넘쳐버렸다.)
		
		사각형 rect = new 사각형(5, 20);
		System.out.println(rect.calcRound());
		System.out.println(rect.calcArea());
		
		삼각형 직tri = new 삼각형(5,10);
		삼각형 정tri = new 삼각형(10);
		System.out.println(직tri.calcRound());
		System.out.println(직tri.calcArea());
		System.out.println(정tri.calcRound());
		System.out.println(정tri.calcArea());
		
		원 circle = new 원(10);
		System.out.println(circle.calcRound());
		System.out.println(circle.calcArea());
	}

}

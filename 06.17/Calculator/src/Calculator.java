
public class Calculator {
	
	// add, minus, multiple, divide
	// 인자는 2개. 앞의 수에서 뒤의 수를 사칙 연산
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	
	public int minus (int num1, int num2) {
		return num1 - num2;
	}
	
	public double minus (double num1, double num2) {
		return num1 - num2;
	}
	
	
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}
	
	public double multiple(double num1, double num2) {
		return num1 * num2;
	}
	
	
	public float divide(int num1, int num2) {
		return (float)num1 / num2;
	}
	
	public double divide(double num1, double num2) {
		return (double)num1 / num2;
	}
	
	
	public int getOnlyQuotient(int a, int b) {
		int result = 0;
		try {
			result = a / b; // b가 0이면 이 문장을 실행할 때 예외가 발생하고 catch로 이동
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다. 다른 숫자로 나눠주세요.");
			// e.printStackTrace(); // 어떤 예외가 발생했는지 로그를 찍어준다.
		}
		return result;
	}
	
	public int getOnlyQuotient(double a, double b) {
		return (int)(a / b);
	}
	
}

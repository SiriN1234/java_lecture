import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		double total = 0.0;
		
		for(int i = 0; i < 100; i++) {
			total += 0.1;
		}
		
		System.out.println(total);

		// 0.1을 100번 더하기 한 누적값 -> 10
		// 컴퓨터는 십진수 0.1이라는 값을 '정확하게' 저장할 수 없는 구조다.
		// 왜냐하면 부동소수점을 썼기 때문에
		// 그러면 부동소수점을 쓰는 이유?
		// 정확도를 아주 조금 잃은 대신에 훨씬 넓은 범위의 값을 표현할 수 있음
		
		
		BigDecimal total2 = new BigDecimal(0.0);
		
		for(int i = 0; i < 100; i++) {
			total2 = total2.add(new BigDecimal(0.1));
		}
		
		System.out.println(total2);
		// add, substract, multiply, divide, remainder, compareTo, max, min 등이 있음
		
		
		if(Double.compare(total,  10.0) < 0){ // 첫 번째 인자와 두 번째 인자를 비교
			// 같으면 0, 첫 번째가 크면 양수, 두 번째가 크면 음수 반환
			System.out.println("compare로 비교");
		}
		
		// 그렇다면 부동소수점의 연산 오차를 어떻게 해결할 수 있을까?
		// 자바의 부동소수점 데이터타입을 쓰지 않고 BigDecimal을 사용 
	}

}


public class Lambda {
	public static void main(String[] args) {
		
		YourType you = (String name) -> { System.out.printf("내 이름은 %s입니다.", name); };
		// 익명함수가 있는데 String 데이터 타입으로 name이라는 이름으로 인자를 1개 받는다.
		// 본문은 내 이름은 {받은 인자} 입니다. 라고 출력
		you.talk("홍길동");
		
		
	}
	
	// 함수를 호출하는 위치가 람다식이 들어갈 위치
	// 문법 : 이름은 없고 (매개변수) -> 본문;
}

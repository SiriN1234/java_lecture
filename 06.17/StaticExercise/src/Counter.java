// 인스턴스가 하나 만들어 질 때마다 조회수 1을 높이는 작업
public class Counter {
	static int count = 0; // 정적화.
	// 전역화 = 정의된 지역에 상관없이 프로그램이 실행되어 종료될 때 까지 유지
	// 인스턴스화 할 때가 아니라 클래스를 컴파일 할 때 메모리에 올라간다.
	// 그 때 올라가서 프로그램이 종료될 때까지 유지되니까 '공유'되는 성질을 갖게 된다.
	
	public Counter() {
		count++;
		System.out.println("생성됨. count : " + count);
	}
}

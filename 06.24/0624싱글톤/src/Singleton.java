
public class Singleton {
	
	//static  인스턴스마다 가지고있는 것이 아니라 공유되는 개념. 
	//인스턴스가 만들어지기 전에 미리 메모리에 로드
	private static Singleton one;
	
	//생성자를 private으로 만들어서 외부에서 볼수없도록함
	private Singleton() {
		System.out.println("생성됨");
	}
	
	//private이기 때문에 외부에서 생성자 호출 못함.
	//인스턴스를 얻기위한 메소드 제작
	public static Singleton getInstance() {
		if(one == null) {
			System.out.println("새로만듦");
			one = new Singleton();	//인스턴스 생성
		}
		return one;
	}
}

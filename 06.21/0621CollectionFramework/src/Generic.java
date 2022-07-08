import java.util.List;
import java.util.ArrayList;

public class Generic {
	
	// 함수의 정의와 호출이 다르다. 파라미터와 아규먼트는 다르다.
	
	public static void main(String[] args) {
		
//		//일반
//		List list = new ArrayList();
//		list.add("hello");;
//		String str = (String)list.get(0);
//		System.out.println(str);
//		
//		// 제네릭사용 코드
//		List<String> list2 = new ArrayList<String>();
//		list2.add("hello");
//		String str2 = list2.get(0); // 타입 반환을 하지 않습니다.
//		System.out.println(str2);
		
		Box<String> strBox = new Box<String>("오");
		Box<Integer> intBox = new Box<Integer>(5);
		
		String a = strBox.get();
		Integer b = intBox.get();
		
		System.out.println(a);
		System.out.println(b);
		
		// 이때까지는 함수를 정의하든, 클래스를 정의하든 데이터 타입을 명시적으로 고정시켜줬었다.
		// 하지만 제네릭을 이용하면 '정의할 때'가 아니라 '인스턴스가 만들어진 때' 데이터 타입이 결정된다.
		
		
	}
}

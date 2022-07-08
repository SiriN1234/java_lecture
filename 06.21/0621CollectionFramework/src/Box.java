/*
 <E> : Element
 <K> : Key
 <N> : Number
 <T> : Type
 <V> : Value
 */


public class Box<T> {
	
	// 함수를 정의 할 때 : 접근제한자 리턴타입 함수명(데이터타입 이름)
	// 이름은 함수를 만드는 사람이 자율적으로 정하는 것
	// 그 데이터 타입으로 들어오는 어떤 값이든지 나는 이 함수 안에서 이 이름으로 쓰겠다
	
	// 제네릭은 어떤 데이터 타입으로 들어오든지 나는 T라는 데이터 타입으로 쓰겠다
	
	
	private T t;
	
	public Box(Object obj) {
		t = (T)obj;
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

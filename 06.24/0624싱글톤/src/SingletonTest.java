
public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();	//기존에 만들어진게 없었으니까 새로만듦
		Singleton singleton2 = Singleton.getInstance();	//있으니까 그놈 리턴
		Singleton singleton3 = Singleton.getInstance(); //있으니까 그놈 리턴
		
		System.out.println(singleton1 == singleton2);
		System.out.println(singleton2 == singleton3);
		System.out.println(singleton1 == singleton3);
	}

}

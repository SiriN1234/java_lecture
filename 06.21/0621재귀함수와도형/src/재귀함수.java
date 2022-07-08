
public class 재귀함수 {
	
	
	public int sigma(int n) {
		if(n<1) {
			return 0 ;
		}else {
			return sigma(n-1)+n;
		}
	}
//	f(5) = f(4) + 5;
//		f(4) = f(3) + 4;
//			f(3) = f(2) + 3;
//				f(2) = f(1) + 2;
//					f(1) = f(0) + 1;	//여기에서 끊어야 하네.
//						f(0) = f(-1) + 0;
//							f(-1) = f(-2) -1;
//								..... 무한
//어떤 조건일때 f(n-1) + 1의 형태를 리턴해야될까.
//	그 조건을 만족하지 않는다면 어떻게 해야될까
	
	public int factorial(int n) {
		if(n<1) {
			System.out.println("1보다 작을때 호출");
			return 1;
		}else {
			System.out.println("else문");
			return factorial(n-1)*n;
		}
	}
}

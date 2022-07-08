public class function {
	/*
	 접근제한자 리턴타입 메소드명(인자타입 인자명, 인자타입 인자명...){
	 	함수 본문;
	 	리턴타입 void가 아닐경우 리턴문;
	 	}
	*/
	public void printDan(int dan) { // 인풋O 아웃풋X
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d", dan, i, dan * i);
		}
		printDan(3);
	}
	
	public void helloWorld() { // 인풋X 아웃풋X
		System.out.println("hello");
		System.out.println("world");
	}
	
	public String cry() { // 인풋X 아웃풋O
		return "cry";
	}
	
	public String cry2(String name) {
		String result = "";
		switch(name) {
		case "tiger" :
			result = "호랭이";
			break;
		case "dolphine" :
			result = "돌고래";
			break;
		case "moneky" :
			result = "몽키";
			break;
		}
		return result;
	}
}

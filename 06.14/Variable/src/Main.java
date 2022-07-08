public class Main {

	public static void main(String[] args) {		
		int a = 5;
		double b = 7.5;
		
		System.out.println(a + b);
		// 크기가 큰 데이터 타입을 따라 감
		
		// call by value. 기본형. 값에 의한 참조
		char x = 'a';
		String y = "hello";
		System.out.println(x + y);
		
		int myNum = a;
		myNum += 10;
		System.out.println("myNum : " + myNum);
		System.out.println("a : " + a);
		
		// call by reference. 참조형. 주소에 의한 참조
		String[] imgArr = {"❤", "🎁"};
		String[] stringArr = {"하트", "선물", ""};
		
		imgArr = stringArr;
		stringArr[2] = "아이스크림"; // 2번째 배열을 건드렸는데
		for(int i = 0; i < imgArr.length; i++) {
			System.out.println(imgArr[i]); // 첫번째 배열이 변함
		}
		
		function_exercise fn = new function_exercise();
		
		System.out.println(fn.add(3,  5));
		System.out.println(fn.minus(33,  55));
		System.out.println(fn.minus2(33,  55));
		int result = fn.getMaxNum(10,  30,  20);
		System.out.println(result);
		System.out.println(fn.isOverHundred(result));
		fn.printEven();
		fn.multipleOfThree();
		fn.multipleOfFive();
		fn.printStr("abc", -3);
		System.out.println(fn.getSeason(13));
		System.out.println(fn.isInclude("abc", "ac"));
		System.out.println(fn.getCountInclude("abcdef", "acb"));
		System.out.println(fn.getCountInclude2("abcdef", "cde"));
	}
}
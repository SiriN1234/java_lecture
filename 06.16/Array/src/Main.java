import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] intArr = {1, 2, 3, 4, 5};
		int intArr2[] = {1, 2, 3, 4, 5};
		int[] intArr3;
		
		System.out.println(intArr.length);
		System.out.println(intArr[4]);
		// System.out.println(intArr[5]);
		// intArr3 = {1, 2, 3, 4, 5}; // C언어 형식, 값 할당이 안됨
		// Array constants can only be used in initializers
		// 배열 상수는 초기화에만 사용할 수 있습니다
		intArr3 = new int[]{1, 2, 3, 4, 5}; // Java 형식
		
		if(intArr == intArr3) { // 배열은 원시형 데이터 타입이 아니기 때문에 주소를 참조하고, 서로 다른
			System.out.println("동일");
		}
		
		String[] strArr1 = {"일", "이", "삼"};
		// cannot convert from String[] to String
		// 스트링 배열을 스트링으로 변환할 수 없습니다.
		
		int [][] twoMension  = {{1, 2, 3}
								, {4, 5,6}};
		
		System.out.println(twoMension.length); // 2가 나옴
		System.out.println(twoMension[1]);
		
		// 향상된 for문, iterator = 반복할 수 있는 객체
		// iterator의 모든 요소에 대해서 반복을 수행
		for(int i : twoMension[1]) {
			System.out.printf(i + " ");
		}
		
		int [][][] threeDemension = new int[2][4][6];
		// 6개짜리가 4개 있고 그런 놈이 2개 있다. O
		// 2개짜리가 4개 있고 그런 놈이 6개 있다. X
		System.out.println(threeDemension.length); // 2가 나옴
		
		String[] 계절 = {"봄", "여름", "가을", "겨울"};
		String[] 복사본 = 계절; // 배열의 복사. 그냥 =으로 하면 얕은 복사.
		String[] 진짜복사본;
		String[] 진짜복사본2 = null;
		
//		boolean result = Arrays.asList(계절).contains("핵겨울");
//		System.out.println(result);
		
		if(계절 == 복사본) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		진짜복사본 = 계절.clone();
		if(계절 == 진짜복사본) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		// 깊은 복사를 하기 위해서 반복문을 돌리든가, System.arraycopy() 메소드를 이용해야 함.
//		System.arraycopy(계절, 0, 진짜복사본2, 0, 계절.length);
//		
//		if(계절 == 진짜복사본2) {
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("다르다");
//		}
		
		// 영단어가 저장된 배열. 크기는 5. endDic
		// 한글단어가 저장된 배열. 크기는 5. korDic
		// 한글 랜덤 단어를 보여주고
		// 유저는 영단어를 치고
		// 답이 맞는지 틀렸는지 판단
		// 사과, 바나나, 복숭아, 수박, 파인애플
		// apple, banana, peach, watermelon, pineapple
		
		Random rd = new Random();
		int randomInt = rd.nextInt(5);
		System.out.println(randomInt); // 0~4까지의 랜덤 정수
		
//		System.out.println("키보드로 뭔가를 입력 해주세요: ");
//		Scanner sc = new Scanner(System.in); // 키보드로 입력받기 위한 객체 생성
//		String input = sc.next();
//		System.out.println(input);
		
		String[] engDic = {"apple", "banana", "peach", "watermelon", "pineapple"};
		String[] korDic = {"사과", "바나나", "복숭아", "수박", "파인애플"};
		
		// 한글 랜덤 단어를 보여 줌
		System.out.println(korDic[randomInt]);
		
		// 영단어 입력 받는 부분
		System.out.printf("해당되는 영어를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		// 문자열1 == 문자열2 -> 값을 비교하는게 아니라 주소를 비교
		// 문자열1.equals(문자열2) 값을 비교. 순서는 바뀌어도 됨.
		if(input.equals(engDic[randomInt])) // 유저가 입력한 영단어와 화면에 보여줬던 한글 단어와의 위치가 똑같은 영단어인지를 비교
			System.out.println("정답.");
		else
			System.out.println("오답. 정답은 : " + engDic[randomInt]);
		
		
		// 컴퓨터가 랜덤 1~100까지의 랜덤 숫자 하나를 저장
		// 유저가 5번의 기회 동안 그 숫자를 찾는 게임
		// 답이 입력 값보다 높은지 낮은지 알려줘야 함
		
		int rdNum = rd.nextInt(100) + 1;
		
		System.out.println("1~100 사이의 랜덤 값을 뽑았습니다. 5번 안에 숫자를 맞춰보세요");
		for(int i = 5; i >= 0; i-- ) {
			
			System.out.printf("숫자를 입력하세요 : ");
			
			Scanner scanNum = new Scanner(System.in);
			int inputNum = scanNum.nextInt();
			
			if(inputNum == rdNum) {
				System.out.println("정답입니다. 정답은 " + rdNum + "입니다.");
				break;
			}
			else {
				if(inputNum > rdNum)
					System.out.printf("입력 값이 정답보다 큽니다. 더 작은 값을 입력하세요. ");
				else
					System.out.printf("입력 값이 정답보다 작습니다. 더 큰 값을 입력하세요. ");
				
				if(i >= 2)
					System.out.println((i - 1) + "번의 기회가 남았습니다.");
				else {
					System.out.println("");
					System.out.println("기회가 없습니다! 정답은 " + rdNum + "입니다.");
					break;
				}
			}
		}
		
	}

}

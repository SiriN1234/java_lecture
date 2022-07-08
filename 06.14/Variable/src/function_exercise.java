public class function_exercise {
	
	// 1. 2개의 정수를 입력받아 합친 수를 입력하는 함수 add를 만들자

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	
	
	// 2. 2개의 정수를 입력받아 앞의 수에서 뒤의 수를 뺀 수를 리턴하는 함수 minus를 만들자
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	
	// 3. 2번 문제를 큰 수에서 작은 수를 판별해서 빼도록 업그레이드 하자
	
	public int minus2(int num1, int num2) {
		if(num1 >= num2)
			return num1 - num2;
		else
			return num2 - num1;
	}
	
	
	// 4. 세 개의 수를 입력하면 그 중에서 가장 큰 수를 리턴하는 getMaxNum을 만들자
	
	public int getMaxNum(int num1, int num2, int num3) {
//		int compare;
//		if(num1 >= num2)
//			compare = num1;
//		else
//			compare = num2;
//		
//		if(compare >= num3)
//			return compare;
//		else
//			return num3;
		
		int max = num1;
		if(max < num2)
			max = num2;
		if(max < num3)
			max = num3;
		return max;
	}
	
	
	// 5. 정수 하나를 인자로 받는isOverHundred라는 함수를 만들고 정수 하나를 인자로 받아
	// 100 초과면 true, 100 이하면 false를 리턴
	
	public boolean isOverHundred(int num) {
		if (num > 100)
			return true;
		else
			return false;
	}
	
	
	// 6. 1~100까지의 정수 중에 짝수만 콘솔로 출력
	
	public void printEven() {
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
	}
	
	
	// 7. 1~100까지의 정수 중에 3의 배수만 콘솔로 출력
	
	public void multipleOfThree() {
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0)
				System.out.println(i);
		}
	}
	
	
	// 8. 1~100까지 정수를 순회하면서 5의 배수만 출력
	// 단, 그 중에 10의 배수는 출력하지 말라
	
	public void multipleOfFive() {
		for(int i = 1; i < 101; i++) {
			if(i % 5 == 0 && i % 10 != 0)
				System.out.println(i);
		}
	}
	
	
	// 9. 첫 번째 인자로 문자열, 두 번째 인자로 양수를 받아 문자열을 숫자의 횟수만큼 출력
	// 만약 음수를 입력했을 경우 잘못된 값을 입력했다고 알려주고 아무 처리도 하지 말라
	
	public void printStr(String str, int num) {
		if(num < 0)
			System.out.println("양수를 입력하세요");
		else {
			for(int i = 0; i < num; i++)
				System.out.println(str);
		}
	}
	
	
	/*
	 10. 달을 입력받아 해당 달이 어느 계절인지 리턴하는 함수 getSeason를 만들자
	 3, 4, 5 : 봄
	 6, 7, 8 : 여름
	 9, 10, 11 : 가을
	 12, 1, 2 : 겨울
	*/
	
	public String getSeason(int num) {
		if (num >= 3 && num < 6)
			return "Spring";
		else if (num >= 6 && num < 9)
			return "Summer";
		else if (num >= 9 && num < 12)
			return "Autumn";
		else if (num == 12 || num == 1 || num == 2)
			return "Winter";
		else
			return (num + "월은 없다");
		
		/*
		int quotient = (int)(num / 3);
		switch(quotient){
		case 1:
			return "Spring";
		case 2:
			return "Summer";
		case 3:
			return "Autumn";
		default:
			return "Winter";
		}
		*/
	}
	
	
	/*
	 11.
	 스트링 2개를 입력받아 첫 번째 문자열 안에 두 번째 문자열이 포함되어 있는지 판단하는 함수
	 isInclude를 만들자
	*/
	
	public String isInclude(String mother, String son) {
		if(mother.contains(son))
			return "포함되어 있음";
		else
			return "포함되어 있지 않음";
	}
	
	/*
	 12.
	 스트링 2개를 입력 받아 첫 번째 문자열 안에 두 번째 문자열이 몇 개 포함되어 있는지 리턴하는 함수
	*/
	
	public int getCountInclude(String mother, String son) {
		int count = 0;
		char mother1[] = mother.toCharArray();
		char son1[] = son.toCharArray();
		for(int i = 0; i < son.length(); i++){
			for(int j = 0; j < mother.length(); j++) {
				if(son1[i] == mother1[j])
					count++;
			}
		}
		
		return count;
	}
	
	
	public int getCountInclude2(String str1, String str2) {
		boolean include = true;
		int count = 0;
		include = str1.contains(str2); // 포함되었는지 참 거짓 판단
		while(include) {
			count++;
			int where = str1.indexOf(str2); // 시작하는 위치 파악
			str1 = str1.substring(where+str2.length());
			// 찾으려는 문자열 크기 + 찾은 인덱스를 하면 현재 문자열의 찾는 위치이고, 그것을 새롭게 str1으로 업데이트
			// 인자가 하나면 해당 위치를 포함하여 이후로 다 자름
			include = str1.contains(str2);
		}
		return count;
	}
}

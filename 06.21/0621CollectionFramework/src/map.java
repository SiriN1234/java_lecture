import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// 키는 영어단어, 벨류는 한글 단어로 맵을 만들고
// 단어 맞추기를 만들어보자


public class map {
	public static void main(String[] args) {
		
		// 1. 맵을 만들기
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		// 2. 맵에 데이터 넣기
		dictionary.put("banana", "바나나");
		dictionary.put("orange", "오렌지");
		dictionary.put("apple", "사과");
		dictionary.put("grape", "포도");
		dictionary.put("watermelon", "수박");
		
		// 3. 하나의 키로 제대로 된 값 빼올 수 있나 확인
//		System.out.println(dictionary.get("banana"));
		
		// 4. 랜덤으로 문제 내기
		Random rd = new Random();
		int randomNum = rd.nextInt(dictionary.size());
		// 랜덤 인덱스에 해당하는 키를 가져와야 함
//		String fr;
//		
//		if(randomNum == 0)
//			fr = "banana";
//		else if(randomNum == 1)
//			fr = "orange";
//		else if(randomNum == 2)
//			fr = "apple";
//		else if(randomNum == 3)
//			fr = "grape";
//		else
//			fr = "watermelon";
		
		Object[] values = dictionary.values().toArray(); //값 리스트, 한글단어
		Object randomKorWord = values[randomNum];
		
		Object[] keys = dictionary.keySet().toArray(); // 키 리스트, 영어단어
		String randomEngWord = (String) keys[randomNum]; // 랜덤 영단어
		
		// 5. 유저에게 입력받기
		System.out.println("해당하는 과일을 영어로 입력하세요");
//		System.out.println(dictionary.get(fr));
		
		System.out.println(randomKorWord);
		
		
		Scanner sc = new Scanner(System.in);
		String fruits = sc.next();
		
		// 6. 정답유무 판별하기
//		if(fr.equals(fruits))
//			System.out.println("정답입니다");
//		else
//			System.out.println("틀렸습니다");
		
		if(randomEngWord.equals(fruits))
			System.out.println("정답");
		else
			System.out.println("오답");
		
	}
}

import java.util.Arrays;
import java.util.Random;


public class Lotto {
	//1부터 45까지 중복 없이 6개의 번호가 있다
	
	// 1. 1부터 45까지의 랜덤 번호 생성
	// 2. 배열에 넣기
	// 3. 중복이 있으면 다시 뽑기
	
	
	int [] numArr = new int[6];
	
	
	public int getRandomNum(int startNum, int endNum) {
		Random random = new Random();
		int num = random.nextInt(endNum) + startNum; // 알고리즘 이해
		// nextInt(int a) = 0부터 a 미만의 랜덤 정수를 리턴한다
		// 거기에 startNum을 더하면 startNum부터 a + startNum 미만의 랜덤 정수를 리턴
		// 0부터 45 미만의 수를 뽑아서 1을 더나히까 1부터 46 미만의 수를 얻게 되는 것
		return num;
	}
	
	
	public Lotto makeLotto() {
		// 1. 리턴이 void에서 Lotto로 바뀜
		// 2. 실체화된 인스턴스를 리턴해야 됨
		// 3. int 6개짜리 변수에 랜덤 값을 담아 그 Lotto 인ㄴ스턴스를 반환
		// 4. this로 바꾸는게 더 좋음
		
		// Lotto lotto = new Lotto();
		int [] newNumberList = new int[6];
		int randNum;
		
		for(int i = 0; i < 6; i++) {
			// 넣기 전에 중복된 것이 있나 검사
			randNum = getRandomNum(1, 45);
			
			for(;;) {
				if(findDup(newNumberList, randNum) == true)
				{
					//System.out.println("중복된 수는 " + randNum + " 중복이 발생한 위치 : " + (i + 1));
					randNum = getRandomNum(1, 45);
				}
				else
					break;
			}
			
			newNumberList[i] = randNum;
			
//			boolean isdup = findDup(numArr, inputNum);
//			if(isdup == true) {
//				System.out.println("중복된 수는 " + inputNum + " 중복이 발생한 위치 : " + (i + 1));
//				inputNum = getRandomNum(1, 8);
//				System.out.println("새로 뽑은 값 : " + inputNum);
//				i--;
//			}
//			else
//				numArr[i] = inputNum;
			
			
		}
		
		sort(newNumberList);
		
		// lotto.numArr = newNumberList;
		
		// return lotto;
		
		this.numArr = newNumberList;
		return this;
	}

	
	public boolean findDup(int[] arr, int targetNum) {
		// 기존의 배열의 값에서 중복된 것이 있나 검사

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == targetNum) {
				//System.out.println("중복");
				return true;
			}
		}
		// System.out.println("중복 안됨");
		return false;
	}
	
	
	public void sort(int[] arr) {
		Arrays.sort(arr);
	}
	
	
	@Override
	public String toString() {
		return "Lotto [num=" + Arrays.toString(numArr) + "]";
	}

	
}

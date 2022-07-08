import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Array arr = new Array();
		
		int arrNum[] = new int[9];
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자 9개를 입력하세요. 9개의 숫자 중 최댓값과 인덱스를 보여줍니다");
//		for(int i = 0; i < 9; i++) {
//			arrNum[i] = scan.nextInt();
//		}
//		arr.printMaxValIdx(arrNum);	
		
		
		NumCount nc = new NumCount();
		nc.numCount(150, 266, 427);
		
		
		ProcessNumber pn = new ProcessNumber();
		int arrNum2[] = {9, 7, 5, 3, 8, 4, 6};
		pn.printCuttedSum(arrNum2, 5);
		
		
		int arrNum3[] = {45678, 90, 123, 45, 67, 890, 150, 2022, 30534};
		pn.divideArrbyNum(arrNum3, 800);
		
		
		
	}

}

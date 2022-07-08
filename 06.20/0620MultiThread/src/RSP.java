import java.util.Random;
import java.util.Scanner;

public class RSP {
	// 5판 먼저 이기는 가위바위보 게임
	// 유저로부터 화면에 입력받기
	// 랜덤
	// 배열
	// 이겼다 졌다 판단해서 출력
	// 3초내로 입력값이 없으면 패배처리
	
	static int gameCount = 1;
	static int winCount = 0;
	static int drawCount = 0;
	
	
	Random random = new Random();
	
	rspThread thread = null;
	
	public static boolean inputCheck = false;
	public static boolean lose = false;
	
	// 컴퓨터가 랜덤 선택하기
	public String cpuChoiceRSP() {
		int num = random.nextInt(3);
				
		if(num == 0) {
			System.out.println("컴퓨터가 낸 것은 가위");
			return "가위";
		}
		else if(num == 1) {
			System.out.println("컴퓨터가 낸 것은 바위");
			return "바위";
		}
		else {
			System.out.println("컴퓨터가 낸 것은 보");
			return "보";
		}
	}
	
	
	// 입력
	public String inputRSP() {
		
		System.out.println("가위 바위 보 3개 중 1개를 입력하세요");
		
		Scanner inputRSP = new Scanner(System.in);
		String RSP = inputRSP.next();
		
		for(;;) {
			
			inputCheck = false;
		
		if(RSP.equals("가위") || RSP.equals("바위") || RSP.equals("보")) {
			inputCheck = true;
			break;
		}
		else {
			System.out.println("다시 입력하세요 ");
			RSP = inputRSP.next();
			inputCheck = true;
			continue;
		}
		
		}
		
		return RSP;
	}
			
	
	// 승패 리턴
	public String judge(String RSP, String cpuRSP) {
		
		if(RSP.equals("가위")) {
			if(cpuRSP.equals("가위"))
				return "draw";
			else if(cpuRSP.equals("바위"))
				return "lose";
			else
				return "win";
		} else if(RSP.equals("바위")) {
			if(cpuRSP.equals("바위"))
				return "draw";
			else if(cpuRSP.equals("보"))
				return "lose";
			else
				return "win";
		} else {
			if(cpuRSP.equals("보"))
				return "draw";
			else if(cpuRSP.equals("가위"))
				return "lose";
			else
				return "win";
		}
		
	}
	
	
	
	// 게임
	public void game() {
		
		

		for(int i = 0; i < 5; i++) {

			System.out.printf("%d번째 판\n", gameCount);
			
			thread = new rspThread(gameCount);
			thread.start();
			
			if(lose == true) {
				gameCount++;
				thread.interrupt();
				System.out.println("lose = true");
				lose = false;
				continue;
			}
			
			
			String RSP = inputRSP();
			String cpuRSP = cpuChoiceRSP();
			
			String vs = judge(RSP, cpuRSP);
			System.out.println(vs);
			
			if(vs.equals("draw")) {
				i--;
				drawCount++;
			} else if(vs.equals("win"))
				winCount++;
			
			gameCount++;
			System.out.println("");
			
		}
		
		System.out.printf("총 게임 횟수는 %d번\n", gameCount);
		System.out.printf("승리 횟수는 %d번, 패배 횟수는 %d번, 비긴 횟수는 %d번\n", winCount, (5 - winCount), drawCount);
		if(winCount >= 3)
			System.out.println("승리");
		else
			System.out.println("패배");
		
		
	}
	
	
	
	
}

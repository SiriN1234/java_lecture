import java.util.Random;
import java.util.Scanner;

public class MainMenu {
	
	static int selectField = 0;
	Battle bm = new Battle(selectField);
	
	Pikachu pika = new Pikachu();
	
	int numSelect;
	
	public void selectMain() {
		
		System.out.println("무엇을 할까요?");
		System.out.println("1. 풀숲 탐색 2. 강가 탐색 3. 동굴 탐색 4. 포켓몬센터에 간다");
		
		Random rd = new Random();
		int quest = rd.nextInt(100); // 탐색시 어떤 이벤트가 발생할지 랜덤으로
		
		Scanner sc = new Scanner(System.in);
		numSelect = sc.nextInt();
		
		
		
		switch(numSelect) {
			case 1:
				selectField = 1;
				if(quest < 70) { // 70% 확률로 포켓몬 조우
					System.out.println("");
					bm.meetEnemy();
				} else if(quest >= 95) { // 5% 확률로 회복약 발견
					System.out.println("상처약을 발견했습니다");
					Potion.potion1++;
				}
				else {
					System.out.println("포켓몬을 만나지 못했습니다");
					System.out.println("");
				}
				
				quest = rd.nextInt(100);
				
				selectMain();
			
			case 2:
				selectField = 2;
				if(quest < 70) { // 70% 확률로 포켓몬 조우
					System.out.println("");
					bm.meetEnemy();
				} else if(quest >= 95) { // 5% 확률로 회복약 발견
					System.out.println("좋은상처약을 발견했습니다");
					Potion.potion2++;
				}
				else {
					System.out.println("포켓몬을 만나지 못했습니다");
					System.out.println("");
				}
				
				quest = rd.nextInt(100);
				
				selectMain();
				
			case 3:
				selectField = 3;
				if(quest < 70) { // 70% 확률로 포켓몬 조우
					System.out.println("");
					bm.meetEnemy();
				} else if(quest >= 95) { // 5% 확률로 회복약 발견
					System.out.println("고급상처약을 발견했습니다");
					Potion.potion3++;
				}
				else {
					System.out.println("포켓몬을 만나지 못했습니다");
					System.out.println("");
				}
				
				quest = rd.nextInt(100);
				
				selectMain();
				
			case 4:
				System.out.println("체력과 PP가 회복되었습니다");
				System.out.println("");
				selectMain();
			default:
				System.out.println("다시 입력하세요");
				System.out.println("");
				selectMain();
		}
		
		
	}
	
}

import java.util.Random;
import java.util.Scanner;

// 몬스터를 불러오는 것

public class Battle {
	
	int fieldNum;
	
	public Battle(int fieldNum) { // 필드넘버를 배틀할 때 부여받음
		this.fieldNum = fieldNum;
	}
	
	InputField infi = new InputField();
	int eLV = infi.returnLevel(fieldNum); // 적 레벨을 받을 인트
	
	
	EnemyMonster em = new EnemyMonster(eLV);
	
	
	String eName; // 적 이름을 받을 스트링
	int mHP = 0; // 내 포켓몬의 HP
	int eHP = 0; // 적 HP
	
	int numSelect;
	Attack at = new Attack();
	Potion po = new Potion();
	
	public void meetEnemy() {
		System.out.println(eName + "을 조우했다");
		selectMenu();
	}
	
	
	public void selectMenu() {
		
		Random rd = new Random();
		int avoid = rd.nextInt(100); // 도망 칠 확률
		
		System.out.printf("메뉴를 선택해 주세요\n1. 공격 2. 회복약 3. 도망\n");
		
		Scanner sc = new Scanner(System.in);
		numSelect = sc.nextInt();
		
		
		
		switch(numSelect) {
			case 1:
				at.inputAttack();
				// 상대방 체력이 0이 아니라면 결과를 출력하고 다신 메인메뉴로
				// 0이라면 break;
				break;
			case 2:
				po.selectPotion();
				selectMenu();
			default:
				if(avoid < 25) {
					// 도망치지 못 할 확률 25%
					// avoid가 25보다 낮으면 도망치지 못 함
					System.out.println("도망치치 못했습니다");
					avoid = rd.nextInt(100);
					// 내 턴은 날아가고 상대방이 공격
					selectMenu();
				} else {
					System.out.println("성공적으로 도망쳤습니다");
					System.out.println("");
				}
				
		}
		
		
	}
	
}

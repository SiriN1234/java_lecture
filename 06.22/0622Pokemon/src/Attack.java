import java.util.Scanner;

public class Attack {
	int damage;
	int attackCase;
	
	public void inputAttack() { // 공격 형태를 받음
		
		System.out.println("공격을 선택해주세요");
		System.out.println("1. 몸통박치기 2. 전광석화 3. 아이언테일 4. 10만볼트");
		
		Scanner sc = new Scanner(System.in);
		int attackCase = sc.nextInt();
		
		this.attackCase = attackCase;
		attackCase();
	}
	
	
	public int attackCase() { // 공격 형태에 따라서 데미지 리턴
		
		Pikachu pika = new Pikachu();
		int damage = pika.returnDamage(attackCase);
		
		return damage;
		
	}
	
}

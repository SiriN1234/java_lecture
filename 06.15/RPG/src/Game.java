
public class Game {
	
	public static void main(String[] args) {
		Player player1 = new Player("SiriN", 100);
		Monster enemy1 = new Slime("빨간슬라임", 100);
		
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		//죽으면 죽었다고 알려주기
		//죽은놈에게는 공격못하기
		
		//무기를 하나 만들어서 그 무기를 장착하면 
		//해당무기의 데미지만큼 플레이어의 데미지를 올려주세요
		Weapon weapon1 = new Weapon();
		weapon1.name = "창";
		weapon1.damage = 20;
		Weapon weapon2 = new Weapon();
		weapon2.name = "총";
		weapon2.damage = 35;
		
		Slime enemy2 = new Slime("초록슬라임", 200);
		player1.setWeapon(weapon2);
		player1.attack(enemy2);
		
		Potion healPotion = new Potion("회복포션(소)", 30, "빨간색", "회복");
//		System.out.println(healPotion.name);
		Potion questionPotion = new Potion("미정");
		
		
		Golem gol1 = new Golem("돌골렘", 1000);
		System.out.println(gol1.kind);
		gol1.defenceOn();
		player1.attack(gol1);
		
		
		enemy2.attack(player1);
		enemy2.powerUp();
		enemy2.attack(player1);
		
		gol1.attack(player1);
		gol1.powerUp();
		gol1.attack(player1);
		
		//데이터 타입이 달라도 하나의 함수로 다른함수처럼 쓰는거. 오버로드
		System.out.println();
	}

}

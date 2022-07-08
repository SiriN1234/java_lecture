
public class Player extends Character {
	//name, hp, mana, damage
	//attack, skill1, skill2

	
	public Player(String name, int hp) {
		//this 가 자기자신이고 super는 부모다.
		//super();	//부모의 기본생성자를 호출한거다.
		super(name, hp);
		this.mana = 100;
		this.damage = 20;
		this.kind = "플레이어";
	}

	public void attack(Monster enemy) {
		if("골렘".equals(enemy.kind)) {
			if(this.damage <=40) {
				this.damage = 0;
			}else {
				this.damage -=10;
			}
			System.out.println("골렘은 10의 데미지를 덜받습니다.");
		}
		
		
		if(enemy.hp<=0) {
			System.out.println(enemy.name+"은(는) 이미 죽은상태라 공격할수 없습니다");
			return;
		}
		int afterhp = enemy.hp - this.damage;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격합니다.\n", this.name, enemy.name, this.damage);

		if(afterhp<0) {	//적이 이번공격에 죽은경우
			afterhp = 0;
			System.out.printf("적이 이번공격에 죽었습니다.\n");
			enemy.hp = afterhp;
			return;
		}
		System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", enemy.name, enemy.hp, afterhp);
		enemy.hp = afterhp;
	}
	
	public void setWeapon(Weapon weapon) {
		System.out.printf("%s 장착완료. 데미지 %d증가. \n", weapon.name, weapon.damage);
		this.damage += weapon.damage;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mana=" + mana + ", damage=" + damage + ", kind=" + kind + "]";
	}

	
	
	
}

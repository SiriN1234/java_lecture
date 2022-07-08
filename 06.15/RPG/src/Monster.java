
public abstract class Monster extends Character{
	
	public Monster(String name, int hp) {
		super(name, hp);
		this.name = name;
		this.hp = hp;
	}
	
	public void attack(Player player) {
		if(this.hp<=0) {
			System.out.println(player.name+"은(는) 이미 죽은상태라 공격할수 없습니다");
			return;
		}
		int afterhp = player.hp - this.damage;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격합니다.\n", this.name, player.name, this.damage);

		if(afterhp<0) {	//적이 이번공격에 죽은경우
			afterhp = 0;
			System.out.printf("적이 이번공격에 죽었습니다.\n");
			player.hp = afterhp;
			return;
		}
		System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", player.name, player.hp, afterhp);
		player.hp = afterhp;
	}
	
	abstract public void powerUp() ;
}

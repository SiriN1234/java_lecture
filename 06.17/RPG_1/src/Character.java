
public class Character {
	String name;
	int hp;
	int mana;
	int damage;
	String kind;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	public void attack(Character obj) {
		if(obj.hp<=0) {
			System.out.println(obj.name+"은(는) 이미 죽은상태라 공격할수 없습니다");
			return;
		}
		
		if("골렘".equals(obj.kind)) {
			if(this.damage <=40) {
				this.damage = 0;
			}else {
				this.damage -=10;
			}
			System.out.println("골렘은 10의 데미지를 덜받습니다.");
		}
		
		
		int afterhp = obj.hp - this.damage;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격합니다.\n", this.name, obj.name, this.damage);

		if(afterhp<0) {	//적이 이번공격에 죽은경우
			afterhp = 0;
			System.out.printf("적이 이번공격에 죽었습니다.\n");
			obj.hp = afterhp;
			return;
		}
		System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", obj.name, obj.hp, afterhp);
		obj.hp = afterhp;
	}
}

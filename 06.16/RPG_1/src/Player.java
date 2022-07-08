
public class Player extends Character{
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

	
	public void setWeapon(Weapon weapon) {
		System.out.printf("%s 장착완료. 데미지 %d증가. \n", weapon.name, weapon.damage);
		this.damage += weapon.damage;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", hp=" + hp + ", mana=" + mana + ", damage=" + damage + "]";
	}
	

	


}

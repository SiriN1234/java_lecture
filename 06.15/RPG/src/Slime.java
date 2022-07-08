
public class Slime extends Monster{

	//슬라임 생성자 정의안에 몬스터생성자 호출
	public Slime(String name, int hp) {
		super(name, hp);
		this.kind = "슬라임";
	}
	
	public void attack(Player player) {
		System.out.println("슬라임의 스물스물 공격");
		super.attack(player);
	}
	

	@Override
	public void powerUp() {
		// TODO Auto-generated method stub
		this.damage *= 2;
	}
	


}

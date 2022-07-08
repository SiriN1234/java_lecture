
public class Slime extends Monster implements transformable{

	//슬라임 생성자 정의안에 몬스터생성자 호출
	public Slime(String name, int hp) {
		super(name, hp);
		this.kind = "슬라임";
	}
	
	public void attack(Character player) {//부모의 공격을 살리면서 업그레이할때
		System.out.println("슬라임의 스물스물 공격");
		super.attack(player);	
	}
	

	@Override
	public void powerUp() {
		this.damage *= 2;
	}
	
	public void transform() {
		System.out.println("슬라임이 변신합니다.");
	}


}

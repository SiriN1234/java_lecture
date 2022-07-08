
public class Golem extends Monster{
	boolean defenceYn = false;
	
	public Golem(String name, int hp) {
		super(name, hp);
		this.damage = 50;
		this.kind = "골렘";
		// TODO Auto-generated constructor stub
	}
	
	//40이하면 데미지를 아예안받고 40초과의 데미지는 10을 깎고 받자
	public void defenceOn() {
		defenceYn = true;
	}
	
	public void defenceOff() {
		defenceYn = false;
	}

	@Override
	public void powerUp() {
		this.damage *= 4;
	}

}

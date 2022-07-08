
public abstract class Monster extends Character{
	
	public Monster(String name, int hp) {
		super(name, hp);
		this.name = name;
		this.hp = hp;
	}
	
	
	abstract public void powerUp() ;
}

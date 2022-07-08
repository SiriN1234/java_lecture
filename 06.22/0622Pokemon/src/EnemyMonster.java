
public class EnemyMonster {
	
	String name;
	int lv;
	int exp = 30 + lv * 10;
	int damage;
	int hp;
	
	// 필드마다 몬스터가 3개가 나오는데
	// 하나는 피가 많고 공격력이 약간 낮고
	// 하나는 밸런스
	// 하나는 피가 적고 공격력이 높고
	// 필드마다 랜덤으로 3개 중 1개 조우 
	
	public EnemyMonster(int lv) {
		this.lv = lv;
	}

}

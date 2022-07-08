
public class Pikachu{
	
	static int pikaLv = 1;
	static int pikaExp = 0;
	
	int maxHP = 200 + pikaLv * 10;
	
	public void checkExp() {
		if(pikaExp > 100 + (5 * Math.pow(pikaLv, 2))) {
			pikaLv++;
			System.out.println(pikaLv + "로 레벨업!");
		}
	}
	
	public int returnDamage(int select) {
		if(select == 1) {
			System.out.println("몸통박치기");
			return 20 + 5 * pikaLv;
		}
		else if(select == 2) {
			System.out.println("전광석화");
			return 30 + 6 * pikaLv;
		}
		else if(select == 3) {
			System.out.println("아이언테일");
			return 30 + 7 * pikaLv;
		}
		else {
			System.out.println("10만볼트");
			return 40 + 10 * pikaLv;
		}
	}

	
	
	
}

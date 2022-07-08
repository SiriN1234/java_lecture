
public class Player {
	String name;
	Lotto[] lottoList; // 크기가 없는 상태
	

	public Player(String name) {
		super();
		this.name = name;
	}

	
	// 로또 n개 구매
	public void buyLotto(int n) {
		lottoList = new Lotto[n]; // 인자로 받은 크기로 지정
		for(int i = 0; i < n; i++) {
			Lotto lotto = new Lotto();
			lottoList[i] = lotto.makeLotto(); // 하나의 로또 생성 (랜덤 6개 숫자)
			System.out.println("로또 구매 : " + lottoList[i]);
		}
		
	}


	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	
	
}

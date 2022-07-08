
public class Game {
	
	public static int matchCount(int[] buy, int[] win) {
		int count = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(buy[i] == win[j])
					count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		
		int rank = 0;
		int buyNum = 5;
		int[] winNum = {3, 7, 12, 25, 30, 33};
		
		Player p1 = new Player("SiriN");
		
		System.out.println(p1);
		
		p1.buyLotto(buyNum);
		
		
		
		for(int i = 0; i < buyNum; i++) {
			rank = matchCount(p1.lottoList[i].numArr, winNum);
			System.out.println(rank + "개 일치함");
		}
		
		
//		for(int i = 0; i < buyNum; i++) {
//			rank = judge(p1.lottoList[i].numArr, winNum);
//			System.out.println(rank + "개 맞음");
//		}
//		
//		public static int judge(int[] challenger, int[] answer) {
//			int count = 0;
//			
//			for(int i = 0; i < 6; i++) {
//				for(int j = 0; j < 6; j++) {
//					if(challenge[i] == answer[j]) {
//						count++;
//					}
//				}
//			}
//			return count;
//		}
		

		
		lotto.makeLotto();
//		System.out.println(lotto);
		
		
		
	}

}

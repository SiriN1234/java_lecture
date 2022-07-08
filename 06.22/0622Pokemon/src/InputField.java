import java.util.Random;

public class InputField {
	
	
	
	public int returnLevel(int fieldNum) { // 필드에 따라서 레벨을 지정해 줌
		
		int lv;
		
		Random rd = new Random();
		int randLv = rd.nextInt(5); 
		
		switch(fieldNum) {
			case 1:
				lv = randLv + 1;
				break;
			case 2:
				lv = randLv + 6;
				break;
			case 3:
				lv = randLv + 11;
				break;
			default:
				lv = 25;
				break;
		}
		
		return lv;
	}

}

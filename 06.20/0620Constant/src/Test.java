
public class Test {
	// 문법 : enum 이름{값, 값, 값}
//	enum Rainbow {RED, ORANGE, YELLOLW, GREEN, BLUE, NAVY, PURPLE};
	
	Day day;
	Rainbow rainbow;
	
	public Test(Day day) {
		this.day = day;
	}
	
	
	
	public void DotW() {
		switch(day) {
		case MONDAY :
			System.out.println("월요일은 좋지 않음");
			break;
		case FRIDAY :
			System.out.println("금요일은 좋음");
		case SATURDAY :
		case SUNDAY :
			System.out.println("주말은 최고지");
			break;
		default :
			System.out.println("평범합니다.");
			break;
		}
	}
	
	public void printRainbow() {
		
	}
	
	public void printRainbowOneColor(int num) {
		
	}

}

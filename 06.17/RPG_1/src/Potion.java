
public class Potion {
	String name;
	int recovery;	//회복량
	String color;
	String type;
	
	public Potion(String 이름, int 회복량, String 색깔, String 종류) {
		name = 이름;
		recovery = 회복량;
		color = 색깔;
		type = 종류;
	}
	
	//오버로드. 오버로딩
	public Potion(String 이름) {
		name = 이름;
		recovery = 30;
		color = "무색";
		type = "미정";
	}
}


public class Main {

	public static void main(String[] args) {
		int a = 56;
		a = 100;
		System.out.println(a);
		
		final double PI = 3.141592;
		System.out.println(PI);
		
		String WotD1 = "TUESDAY";
		Test t1 = new Test(Day.valueOf(WotD1));
		t1.DotW();
		
		t1.printRainbow();
		t1.printRainbowOneColor(3);

	}

}

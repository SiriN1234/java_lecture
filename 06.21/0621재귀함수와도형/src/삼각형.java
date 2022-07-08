
public class 삼각형 extends 도형{
	double width;
	double height;
	String type = null;

	//직삼각형
	public 삼각형(double 가로변, double 세로변) {
		width = 가로변;
		height = 세로변;
		type = "직삼각형";
	}
	
	//정삼각형
	public 삼각형(double 변) {
		width = 변;
		height = 변;
		type = "정삼각형";
	}
	
	@Override
	public double calcRound() {
		double result = 0.0;
		switch (type) {
		case "정삼각형":
			result = 3 * width;
			break;
		case "직삼각형":
			result = width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
			break;

		default:
			break;
		}
		return result;
	}

	@Override
	public double calcArea() {
		double result = 0.0;
		switch (type) {
		case "정삼각형":
			result = Math.sqrt(3) /4 * Math.pow(width, 2);	//  (루트3 / 4) * 변의제곱
			break;
		case "직삼각형":
			result = 0.5 * width * height;
			break;
		default:
			break;
		}
		return result;
	}
}

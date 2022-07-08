
public class 사각형 extends 도형{
	double width;
	double height;
	
	public 사각형(double 가로변, double 세로변) {
		width = 가로변;
		height = 세로변;
	}
	
	@Override
	public double calcRound() {
		return 2*(width+height);
	}

	@Override
	public double calcArea() {
		return width*height;
	}

}

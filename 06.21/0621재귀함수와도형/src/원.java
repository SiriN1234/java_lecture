
public class 원 extends 도형{
	final double PI = 3.141592;
	double radius;
	
	public 원(double 반지름) {
		radius = 반지름;
	}
	
	
	@Override
	public double calcRound() {
		return 2*PI*radius;
	}

	@Override
	public double calcArea() {
		return PI*Math.pow(radius, 2);
	}

}

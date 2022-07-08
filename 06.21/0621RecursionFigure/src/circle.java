
public class circle extends figure {
	
	double width;
	double length;
	
	public circle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double calcRound() {
		return (2 * Math.PI * (0.5 * width));
	}
	
	public double calcArea() {
		return ((0.5 * width) * (0.5 * width) * Math.PI);
	}

}

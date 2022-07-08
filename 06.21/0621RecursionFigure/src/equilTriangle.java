
public class equilTriangle extends figure{
	
	double width;
	double length;
	
	public equilTriangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double calcRound() {
		return (width * 3);
	}
	
	public double calcArea() {
		return (width * length * 0.5);
	}

}

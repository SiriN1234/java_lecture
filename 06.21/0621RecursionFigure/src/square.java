
public class square extends figure{
	
	double width;
	double length;
	
	public square(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double calcRound() {
		return (2 * (width + length));
	}
	
	public double calcArea() {
		return (width * length);
	}

}

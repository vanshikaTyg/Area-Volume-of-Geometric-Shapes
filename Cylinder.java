// VANSHIKA TYAGI
// 22070126128
// AIML B-3


public class Cylinder extends Shape implements Volume {
	private double radius; 
	private double height;

    public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height; 
	}

    @Override
    public double calculateVolume() {
		// TODO Auto-generated method stub 
		return 3.14 * radius * radius * height;
}

    @Override
    public double calculateShape() { 
	// TODO Auto-generated method stub
	return 2 * 3.14 * radius * (radius + height);
	}


}

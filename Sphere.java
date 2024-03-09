// VANSHIKA TYAGI
// 22070126128
// AIML B-3


public class Sphere extends Shape implements Volume{
	private double radius;
	public Sphere(double radius){
		this.radius = radius;
	}

    @Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return (4.0 * 3.14 * (radius * radius * radius));
}

    @Override
	public double calculateShape() {
		// TODO Auto-generated method stub 
		return 4 * 3.14 * radius * radius;
	}


}
 

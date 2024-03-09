// VANSHIKA TYAGI
// 22070126128
// AIML B-3


public class Rectangle extends Shape implements Volume {
	private double length; 
	private double breadth;
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}

    @Override
    public double calculateVolume() {
		// TODO Auto-generated method stub
		// volume not possible 
		return 0;
	}

    @Override
    public double calculateShape() {
		// TODO Auto-generated method stub 
		return length * breadth;
	}
	
}

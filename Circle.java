// VANSHIKA TYAGI
// 22070126128
// AIML B-3


public class Circle extends Shape implements Volume{
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateVolume(){
		//TODO Auto-generated method stub
		//Volume of a circle doesn't exist
		return 0;
	}
	
	@Override 
	public double calculateShape(){
		//TODO Auto-generated method stub
		//Calculating Area
		return 3.14*radius*radius;
	}
}
// VANSHIKA TYAGI
// 22070126128
// AIML B-3


import java.math.*;
public class Pyramid extends Shape implements Volume {
	private double bL; //base Length
	private double bW; //base Width 
	private double height;
	
	public Pyramid(double bL, double bW, double height){
		this.bL = bL;
		this.bW = bW;
		this.height = height;
	}
	
	@Override 
	public double calculateVolume(){
		// TODO Auto-generated method stub 
		return (1.0 * bL * bW * height)/3.0;
	}
	
	@Override
	public double calculateShape(){
		// TODO Auto-generated method stub
		return (bL * bW) + (bL * Math.sqrt(Math.pow(bW/2, 2)+ Math.pow(height, 2)))+ (bW * Math.sqrt(Math.pow(bL/2, 2) + Math.pow(height, 2)));
	}
	
}
// VANSHIKA TYAGI
// 22070126128
// AIML B-3


import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("\nSelect a shape to calculate its area and volume:");
			System.out.println("1. Circle"); 
			System.out.println("2. Rectangle"); 
			System.out.println("3. Square"); 
			System.out.println("4. Sphere"); 
			System.out.println("5. Cylinder"); 
			System.out.println("6. Pyramid"); 
			System.out.println("7. Exit");
			
			int choice = scan.nextInt();
			scan.nextLine(); // Consume newline
			
			if (choice == 7){
				System.out.println("Exited."); 
				break;
			}
			
			Shape shape = null;
			
			switch (choice){
				case 1 :
				System.out.print("Enter the radius of the circle : ");
				double radius = scan.nextDouble(); 
				shape = new Circle(radius); 
				break;
				
				case 2 :
				System.out.print("Enter the length : "); 
				double length = scan.nextDouble(); 
				System.out.print("Enter the breadth : "); 
				double width = scan.nextDouble();
				shape = new Rectangle(length, width); 
				break;
				
				case 3 : 
				System.out.print("Enter the side length : ");
				double side = scan.nextDouble();
				shape = new Square(side); 
				break;
				
				case 4 : 
				System.out.print("Enter the radius : "); 
				double sphereRadius = scan.nextDouble(); 
				shape = new Sphere(sphereRadius);
				break;
				
				case 5 : 
				System.out.print("Enter the radius : ");
				double cylinderRadius = scan.nextDouble(); 
				System.out.print("Enter the height : "); 
				double cylinderHeight = scan.nextDouble(); 
				shape = new Cylinder(cylinderRadius,cylinderHeight);
				break;
				
				case 6 :
				System.out.print("Enter base length : "); 
				double baseLength = scan.nextDouble(); 
				System.out.println("Enter base width : "); 
				double baseWidth = scan.nextDouble(); 
				System.out.print("Enter the height : "); 
				double pyramidHeight = scan.nextDouble(); 
				shape = new Pyramid(baseLength, baseWidth, pyramidHeight);
				break; 
				
				default :
				System.out.println("Invalid choice. Choose again. ");
				continue;
			}
			
			
			if (shape != null){
				shape.showShape(shape.getClass().getSimpleName()); 
				System.out.println("Area: " + shape.calculateShape());
				
				if (shape instanceof Volume){
					System.out.println("Volume: " + ((Volume)shape).calculateVolume());
				}
				else{
					System.out.println("Volume not applicable for this shape.");
				}
				
			}
		}
	}
}			
			

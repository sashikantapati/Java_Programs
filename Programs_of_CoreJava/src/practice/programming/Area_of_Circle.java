package practice.programming;

public class Area_of_Circle {
	public static void area(double radious) {
		System.out.println("Area of the Circle is :"+(3.14*radious*radious));
	}
	public static void main(String[] args) {
		//this is one the direct way 
		double radious=2;
		System.out.println("Area of the Circle is :"+(3.14*radious*radious));
		//Area of circle by formal Argument
		area(2);
	}
}

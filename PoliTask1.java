package polimarphism;

public class PoliTask1 {
	// Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

	public static void main(String[] args) {
		PoliTask1 calculator = new PoliTask1();

        // Calculate the area of a circle
        double circleArea = calculator.calculateArea(5.0); // Calls calculateArea(double radius)
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a rectangle
        double rectangleArea = calculator.calculateArea(10.0, 5.0); // Calls calculateArea(double length, double width)
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a triangle
        double triangleArea = calculator.calculateArea(10.0, 5.0, true); // Calls calculateArea(double base, double height, boolean isTriangle)
        System.out.println("Area of the triangle: " + triangleArea);
		
		
		
		
		// TODO Auto-generated method stub

	}

}

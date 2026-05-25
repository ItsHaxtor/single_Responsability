package ejemplos;

public class area extends figures {
    public area(float square_side, float rectangle_length, float rectangle_width, double circle_radius) {
        super(square_side, rectangle_length, rectangle_width, circle_radius);
    }

    public double calculateSquareArea() {
        return Math.pow(getSquare(), 2);
    }

    public double calculateRectangleArea() {
        return getRectangleLength() * getRectangleWidth();
    }

    public double calculateCircleArea() {
        return Math.PI * Math.pow(getCircleRadius(), 2);
    }


}

package ejemplos;
public class figures {
    private float square_side;
    private float rectangle_length;
    private float rectangle_width;
    private double circle_radius;

    public figures(float square_side, float rectangle_length, float rectangle_width, double circle_radius) {
        this.square_side = square_side;
        this.rectangle_length = rectangle_length;
        this.rectangle_width = rectangle_width;
        this.circle_radius = circle_radius;
    }

    public float getSquare() {
        return square_side;
    }

    public void setSquare(float square_side) {
        this.square_side = square_side;
    }

    public float getRectangleLength() {
        return rectangle_length;
    }

    public void setRectangleLength(float rectangle_length) {
        this.rectangle_length = rectangle_length;
    }

    public float getRectangleWidth() {
        return rectangle_width;
    }

    public void setRectangleWidth(float rectangle_width) {
        this.rectangle_width = rectangle_width;
    }

    public double getCircleRadius() {
        return circle_radius;
    }

    public void setCircleRadius(double circle_radius) {
        this.circle_radius = circle_radius;
    }
}

package ejemplos;

public class Main {
    public static void main(String[] args) {
        area area = new area(5, 4, 3, 2);
        output output = new output();
        
        output.Display_SquareArea(area.calculateSquareArea());
        output.Display_RectangleArea(area.calculateRectangleArea());
        output.Display_CircleArea(area.calculateCircleArea());
    }
}
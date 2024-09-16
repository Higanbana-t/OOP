package baithuchanh1.bai2;
class Rectangle {
    private int width;
    private int height;
 
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
 
    public int calculatePerimeter() {
        return 2 * (width + height);
    }
 
    public int calculateArea() {
        return width * height;
    }
}
public class bai2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Chu vi của hình chữ nhật là: " + rectangle.calculatePerimeter());
        System.out.println("Diện tích của hình chữ nhật là: " + rectangle.calculateArea());

    }
}

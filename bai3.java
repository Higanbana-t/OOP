package baithuchanh1.bai3;


public class bai3 {
    public static void main(String[] args) {
        try {
            // Khởi tạo đối tượng Circle với bán kính hợp lệ
            Circle circle = new Circle(7);
            System.out.println("Bán kính hình tròn: " + circle.getRadius());
            System.out.println("Chu vi của hình tròn: " + circle.getPerimeter());
            System.out.println("Diện tích của hình tròn: " + circle.getArea());

            // Khởi tạo đối tượng Rectangle với chiều rộng và chiều cao hợp lệ
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Chiều rộng hình chữ nhật: " + rectangle.getWidth());
            System.out.println("Chiều cao hình chữ nhật: " + rectangle.getHeight());
            System.out.println("Chu vi của hình chữ nhật: " + rectangle.getPerimeter());
            System.out.println("Diện tích của hình chữ nhật: " + rectangle.getArea());
        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}



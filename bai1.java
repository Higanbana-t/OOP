package baithuchanh1.bai1;
public class bai1 {

    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Sử dụng: java Rectangle <width> <height>");
            return;
        }
        try {
            System.out.println("Chiều rộng: " + args[0]);
            System.out.println("Chiều cao: " + args[1]);
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            if (width <= 0 || height <= 0) {
                System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương!");
                return;
            }

            // Tính chu vi và diện tích
            int perimeter = calculatePerimeter(width, height);
            int area = calculateArea(width, height);

            // In kết quả
            System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
            System.out.println("Diện tích của hình chữ nhật là: " + area);

        } catch (NumberFormatException e) {
            System.out.println("Chiều rộng và chiều cao phải là các số nguyên!");
        }
    }

    // Phương thức tính chu vi
    public static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    // Phương thức tính diện tích
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}

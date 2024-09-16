package baithuchanh1.bai3;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);  // Sử dụng phương thức setter để kiểm tra giá trị
        setHeight(height); // Sử dụng phương thức setter để kiểm tra giá trị
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (Common.isPositiveInteger(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Chiều rộng phải là số nguyên dương.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (Common.isPositiveInteger(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Chiều cao phải là số nguyên dương.");
        }
    }
}

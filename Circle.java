package baithuchanh1.bai3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius); // Sử dụng phương thức setter để kiểm tra giá trị
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (Common.isPositiveInteger(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Bán kính phải là số nguyên dương.");
        }
    }
}

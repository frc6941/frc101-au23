import static java.lang.Math.*;

public class Rectangle {
    private final double length;
    private final double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLengthMm() {
        return cmToMm(length);
    }

    public double getHeightMm() {
        return cmToMm(height);
    }

    private double cmToMm(double cm) {
        return cm * 10;
    }

    public double getArea() {
        return getLengthMm() * getHeightMm();
    }

    public double getPerimeter() {
        return 2 * (getLengthMm() + getHeightMm());
    }

    public double getDiagonal() {
        return sqrt(pow(getLengthMm(), 2) + pow(getHeightMm(), 2));
    }
}

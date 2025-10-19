package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        // Rounded to two decimals to match output style
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Circle (radius %.1f cm)", radius);
    }
}

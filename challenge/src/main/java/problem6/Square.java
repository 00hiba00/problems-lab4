package problem6;

public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        double result = side * side;
        return Math.round(result * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("Square (side %.1f cm)", side);
    }
}

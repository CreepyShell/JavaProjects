package Lab9_exercise2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    @Override
    public String toString() {
        return "Shape type: " + super.type +
                "\nArea=" + this.area() +
                "\nPerimeter=" + this.perimeter();
    }

    public Ellipse() {
        super("Ellipse");
    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.setMajorAxis(majorAxis);
        this.setMinorAxis(minorAxis);
    }

    @Override
    public double area() {
        return Math.PI * this.majorAxis * this.minorAxis;
    }

    @Override
    public double perimeter() {
        return Math.round(2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2) * 100) / 100.0;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis < 0)
            this.majorAxis = 0;
        else
            this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis < 0)
            this.minorAxis = 0;
        else
            this.minorAxis = minorAxis;
    }
}

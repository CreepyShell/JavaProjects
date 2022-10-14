package Lab9_exercise2;

public class Triangle extends Shape {
    private double side1Length;
    private double side2Length;
    private double side3Length;

    public Triangle() {
        super("Triangle");
    }

    public Triangle(double side1Length, double side2Length, double side3Length) {
        super("Triangle");
        this.setSide1Length(side1Length);
        this.setSide2Length(side2Length);
        this.setSide3Length(side3Length);
    }

    public double getSide1Length() {
        return side1Length;
    }

    public void setSide1Length(double side1Length) {
        if (side1Length < 0)
            this.side1Length = 0;
        else
            this.side1Length = side1Length;
    }

    public double getSide2Length() {
        return side2Length;
    }

    public void setSide2Length(double side2Length) {
        if (side2Length < 0)
            this.side2Length = 0;
        else
            this.side2Length = side2Length;
    }

    public double getSide3Length() {
        return side3Length;
    }

    public void setSide3Length(double side3Length) {
        if (side3Length < 0)
            this.side3Length = 0;
        else
            this.side3Length = side3Length;
    }

    @Override
    public String toString() {
        return "Shape type: " + super.type +
                "\nArea=" + this.area() +
                "\nPerimeter=" + this.perimeter();
    }

    @Override
    public double area() {
        double s = (this.side1Length + this.side2Length + this.side3Length) / 2;
        return Math.sqrt(s * (s - this.side1Length) * (s - this.side2Length) * (s - this.side3Length));
    }

    @Override
    public double perimeter() {
        return this.side3Length + this.side2Length + this.side1Length;
    }
}

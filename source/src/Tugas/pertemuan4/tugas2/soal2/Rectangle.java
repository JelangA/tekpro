package Tugas.pertemuan4.tugas2.soal2;

// Rectangle class
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this(width, length, "red", true);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return " A Rectangle with width="+getWidth()+" and length="+ getLength() +", which is a subclass of "+super.toString();
    }
}


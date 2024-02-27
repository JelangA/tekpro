package Tugas.pertemuan4.tugas2.soal2;

public class Square extends Rectangle{

    private double side;



    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Square with side="+side+", which is a subclass of "+super.toString();
    }
}

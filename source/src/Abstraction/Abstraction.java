package Abstraction;

public class Abstraction {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Square square = new Square(5);

        System.out.println("keliling lingkaran = "+circle.keliling());
        System.out.println("luas lingkaran = "+circle.luas());
        System.out.println("keliling persegi = "+square.keliling());
        System.out.println("luas persegi = "+square.luas());


    }
}

interface Shape {
    double luas();
    double keliling();
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double luas() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double luas() {
        return side * side;
    }

    @Override
    public double keliling() {
        return 4 * side;
    }
}

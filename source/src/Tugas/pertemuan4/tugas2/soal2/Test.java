package Tugas.pertemuan4.tugas2.soal2;

public class Test {

    public static void main(String[] args) {
        Shape shape1 = new Shape("green", false);
        System.out.println(shape1.toString());

        //setelah set
        shape1.setColor("black and yellow");
        shape1.setFilled(true);
        System.out.println(shape1);

        Rectangle rectangle = new Rectangle(10,10);
        System.out.println(rectangle.toString());


    }
}

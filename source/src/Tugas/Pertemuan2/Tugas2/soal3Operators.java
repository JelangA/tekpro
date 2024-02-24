package Tugas.Pertemuan2.Tugas2;

public class soal3Operators {
    public static void main(String[] args) {

        double x = 92.49;
        //pada (int) Math.round(x) berfungsi untuk melakukan convert data menjadi int
        //int nx =  (int) Math.round(x);
        long nx =  Math.round(x);//hasil pengembalian fungsi Math.round() bertype long
        System.out.println(nx);
    }
}







class soal3Test {
    public static void main(String[] args) {
        double x = 92.20;

        //pada (int) Math.round(x) berfungsi untuk melakukan convert data menjadi int
        int nx = (int) x;
        System.out.println(nx);
    }
}

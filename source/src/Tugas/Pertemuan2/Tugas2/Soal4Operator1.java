package Tugas.Pertemuan2.Tugas2;

public class Soal4Operator1 {
    static short methodOne(long l)
    {
        int i = (int) l;//konversi long l->int i
        return (short) i;//mengembalikan i dengan type short
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;//konversi double d->float f
        byte b = (byte) methodOne((long) f);//argumen method di convert menjadi long
        //hasil pengembalian fungsi methodOne bertype short->byte b
        System.out.println(b);
    }
}

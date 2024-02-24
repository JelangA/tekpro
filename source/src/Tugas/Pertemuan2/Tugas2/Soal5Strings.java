package Tugas.Pertemuan2.Tugas2;

import java.util.Scanner;

public class Soal5Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println(mencariPanjangKata(A,B));
        System.out.println(leksikografisHuruf(A,B));
        System.out.println(hurufAwalKapital(A) + hurufAwalKapital(B));
    }

    public static int mencariPanjangKata(String a, String b){
        return (a + b).length();
    }
    public static String leksikografisHuruf(String a, String b){
        if (a.length() > b.length()){
            return "No";
        }else {
            return "Yes";
        }
    }
    public static String hurufAwalKapital(String a){
        return a.substring(0,1).toUpperCase() + a.substring(1) + " ";
    }
}

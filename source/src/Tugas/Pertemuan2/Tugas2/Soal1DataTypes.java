package Tugas.Pertemuan2.Tugas2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Soal1DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        ArrayList<BigInteger> n = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            try {
                n.add(new BigInteger(scanner.next()));
            } catch (NumberFormatException e) {
                System.out.println(" can't be fitted anywhere.");
                scanner.next();
            }
        }
        for (int j = 0; j < h; j++) {
            System.out.println(n.get(j) + " can be fitted in:");
            System.out.println(checkTypeData(n.get(j)));
        }
    }

    public static String checkTypeData(BigInteger n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0
                && n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
            stringBuilder.append("* byte\n");
        }
        if (n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0
                && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
            stringBuilder.append("* short\n");
        }
        if (n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0
                && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
            stringBuilder.append("* integer\n");
        }
        if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0
                && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
            stringBuilder.append("* long\n");
        } else {
            stringBuilder.append("can't be fitted anywhere.\n");
        }
        return stringBuilder.toString();
    }
}

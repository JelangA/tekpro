package Tugas.pertemuan4.tugas1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<DVD> daftarDVD = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input DVD Musik");
            System.out.println("2. Input DVD Film");
            System.out.println("3. Tampilkan Semua DVD");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline karakter setelah nextInt()

            switch (pilihan) {
                case 1:
                    inputDVDMusik(scanner, daftarDVD);
                    break;
                case 2:
                    inputDVDFilm(scanner, daftarDVD);
                    break;
                case 3:
                    tampilkanSemuaDVD(daftarDVD);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void inputDVDMusik(Scanner scanner, List<DVD> daftarDVD) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi = scanner.nextLine();
        System.out.print("Produser: ");
        String produser = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Kategori: ");
        char kategori = scanner.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter setelah nextInt()
        System.out.print("Top Hits (pisahkan dengan koma): ");
        String topHitsInput = scanner.nextLine();
        List<String> topHits = Arrays.asList(topHitsInput.split(", "));

        DVD dvdMusik = new DVDMusik(judul, penyanyi, produser, publisher, kategori, stok, topHits);
        daftarDVD.add(dvdMusik);
        System.out.println("DVD musik berhasil ditambahkan.");
    }

    public static void inputDVDFilm(Scanner scanner, List<DVD> daftarDVD) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Pemeran (pisahkan dengan koma): ");
        String pemeranInput = scanner.nextLine();
        List<String> pemeran = Arrays.asList(pemeranInput.split(", "));
        System.out.print("Sutradara: ");
        String sutradara = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Kategori: ");
        char kategori = scanner.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter setelah nextInt()

        DVD dvdFilm = new DVDFilm(judul, pemeran, sutradara, publisher, kategori, stok);
        daftarDVD.add(dvdFilm);
        System.out.println("DVD film berhasil ditambahkan.");
    }

    public static void tampilkanSemuaDVD(List<DVD> daftarDVD) {

        if (daftarDVD.isEmpty()) {
            System.out.println("Tidak ada DVD yang tersedia.");
        } else {
            System.out.println("Daftar DVD:");
            for (DVD dvd : daftarDVD) {
                dvd.tampilkanInfo();
                System.out.println();
            }
        }
    }
}
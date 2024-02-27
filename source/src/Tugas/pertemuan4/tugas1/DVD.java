package Tugas.pertemuan4.tugas1;

public class DVD {
    String judul;
    String publisher;
    char kategori;
    int stok;

    public DVD(String judul, String publisher, char kategori, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("=================================  List Daftar DVD =================================");
        System.out.println("Judul: " + judul);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
    }
}

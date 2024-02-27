package Tugas.pertemuan4.tugas1;

import java.util.List;

public class DVDMusik extends DVD {
    String penyanyi;
    String produser;
    List<String> topHits;

    public DVDMusik(String judul, String penyanyi, String produser, String publisher, char kategori, int stok, List<String> topHits) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.println("Top Hits: " + topHits);
    }
}

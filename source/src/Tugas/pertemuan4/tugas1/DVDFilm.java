package Tugas.pertemuan4.tugas1;

import java.util.List;

public class DVDFilm extends DVD {
    List<String> pemeran;
    String sutradara;

    public DVDFilm(String judul, List<String> pemeran, String sutradara, String publisher, char kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pemeran: " + pemeran);
        System.out.println("Sutradara: " + sutradara);
    }
}
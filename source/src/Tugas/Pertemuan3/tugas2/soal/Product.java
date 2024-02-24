package Tugas.Pertemuan3.tugas2.soal;

public class Product {
    private static int lastId = 1;
    private int id;
    private String namaMakanan;
    private double harga_makanan;
    private int stok;

    public Product(String makanan, double harga_makanan, int stok) {
        this.id = lastId;
        lastId++;
        this.namaMakanan = makanan;
        this.harga_makanan = harga_makanan;
        this.stok = stok;
    }
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }
    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getId() {
        return id;
    }
    public String getNamaMakanan() {
        return namaMakanan;
    }
    public double getHarga_makanan() {
        return harga_makanan;
    }
    public int getStok() {
        return stok;
    }

}

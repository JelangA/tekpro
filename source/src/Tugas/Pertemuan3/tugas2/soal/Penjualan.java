package Tugas.Pertemuan3.tugas2.soal;

public class Penjualan {

    private String nama_produk;
    private int quantity;
    private long harga_total;

    public Penjualan(String nama_produk, int quantity, long harga_total) {
        this.nama_produk = nama_produk;
        this.quantity = quantity;
        this.harga_total = harga_total;
    }

    public String getNama_produk() {
        return nama_produk;
    }
    public int getQuantity() {
        return quantity;
    }

    public long getHarga_total() {
        return harga_total;
    }
}

public class ProdukTes {

    private String namaProdukTes;
    private int harga;

    private int qty;

    public ProdukTes() {
    }

    public ProdukTes(String namaProdukTes, int harga, int qty) {
        this.namaProdukTes = namaProdukTes;
        this.harga = harga;
        this.qty = qty;
    }

    public String getnamaProdukTes() {
        return namaProdukTes;
    }

    public void setnamaProdukTes(String namaProdukTes) {
        this.namaProdukTes = namaProdukTes;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

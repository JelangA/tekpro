package Tugas.Pertemuan3.tugas2.soal;

import java.text.NumberFormat;
import java.util.*;
import java.util.List;

public class Restaurant {
    private List<Product> products;
    private List<Penjualan> penjualans;
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = new ArrayList<>(products);
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void addProductList(List<Product> products) {
        this.products.addAll(products);
    }
    public void updateProduct(Product updatedProduct, int id) {
        for (Product value : getProducts()) {
            if (value.getId() == id) {
                value.setNamaMakanan(updatedProduct.getNamaMakanan());
                value.setHarga_makanan(updatedProduct.getHarga_makanan());
                value.setStok(updatedProduct.getStok());
                return;
            }
        }
    }
    public void deleteProduct(int id) {
        this.products.removeIf(n -> n.getId() == id);
    }
    public void showProductById(Product product) {
        System.out.println("Product dengan id: " + product.getId());

        System.out.println("=======================================");
        System.out.printf("%-15s %-5.5s %s %n", product.getNamaMakanan(), product.getStok(), product.getHarga_makanan());
        System.out.println("=======================================");

    }
    public void showProduct() {
        System.out.println("List Daftar Product Makanan");
        System.out.println("=======================================");
        for (int i = 0; i < getProducts().size(); i++) {
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            String harga = formatRupiah.format(getProducts().get(i).getHarga_makanan());
            String stokInfo = "[" + getProducts().get(i).getStok() + "]";
            String ProductInfo = getProducts().get(i).getId() + ". " + getProducts().get(i).getNamaMakanan();

            if (isOutOfStock(i)) {
                harga += "   !!! Stok Habis !!!";
            }
            System.out.printf("%-15s %-5.5s %s %n", ProductInfo, stokInfo, harga);
        }
        System.out.println("=======================================");
    }
    public List<Penjualan> getPenjualans() {
        return penjualans;
    }
    public Product getProductById(int id, boolean showData) {
        for (int i = 0; i < getProducts().size(); i++) {
            if (getProducts().get(i).getId() == id) {
                if (showData) {
                    showProductById(getProducts().get(i));
                }
                String nama = getProducts().get(i).getNamaMakanan();
                if (isOutOfStock(i)) {
                    nama += "   !!! Stok Habis !!!";
                    getProducts().get(i).setNamaMakanan(nama);
                }
                return getProducts().get(i);
            }
        }
        return null;
    }
    public boolean isOutOfStock(int i) {
        return getProducts().get(i).getStok() == 0;
    }
    public void updateQuantity(int id,int qty){
        int newStok = getProductById(id,false).getStok() - qty;
        getProductById(id,false).setStok(newStok);
    }
    public void setPenjualans(int id, int qty) {


        String namaMakanan = getProductById(id, false).getNamaMakanan();
        double hargaMakanan = getProductById(id, false).getHarga_makanan();
        long totalHarga = (long) hargaMakanan * qty;


        Penjualan[] penjualanlist = {new Penjualan(namaMakanan, qty, totalHarga)};

        this.penjualans = new ArrayList<>(List.of(penjualanlist));
    }
    public void showPenjualan() {
        System.out.println("List Daftar Penjualan");
        System.out.println("=======================================");
        for (int i = 0; i < getPenjualans().size(); i++) {
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            String harga = formatRupiah.format(getPenjualans().get(i).getHarga_total());
            String quantity = "[" + getPenjualans().get(i).getQuantity() + "]";
            String ProductInfo = getPenjualans().get(i).getNama_produk();

            if (isOutOfStock(i)) {
                harga += "   !!! Stok Habis !!!";
            }
            System.out.printf("%-15s %-5.5s %s %n", ProductInfo, quantity, harga);
        }
        System.out.println("=======================================");
    }

}

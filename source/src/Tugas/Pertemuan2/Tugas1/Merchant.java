package Tugas.Pertemuan2.Tugas1;

public class Merchant {

    private String name;
    private Product[] productsList;

    public void setProductsList(Product[] productsList) {
        this.productsList = productsList;
    }
    public Product[] getProductsList() {
        return productsList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

package Tugas.Pertemuan2.Tugas1;

public class Main {

    public static void main(String[] args) {

        Product[] productsArray = { new Product("ayam"), new Product("ikan"), new Product("mari mas") };

        Merchant toko = new Merchant();
        toko.setName("toko ibu imas");
        toko.setProductsList(productsArray);

        Customer customer = new Customer();
        customer.setName("jelang");
        customer.order(customer.getName(), toko.getProductsList()[0].getName(),toko.getName() );

    }
}

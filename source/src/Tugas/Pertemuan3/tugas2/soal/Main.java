package Tugas.Pertemuan3.tugas2.soal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int userInput = 1;

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        while (userInput != 0) {
            boolean dontShowMenu = true;
            System.out.println("==============================  Pilih Menu ========================");
            System.out.println("1. set Product \n2. Add Product \n3. order Product \n4. show data Penjualan");
            System.out.println("input : ");
            userInput = scanner.nextInt();
            System.out.println();


            if (userInput == 1) {
                restaurant.setProducts(initProduct());
            } //init product
            if (userInput == 2) {
                String input = "";
                scanner.nextLine();

                while (!input.equalsIgnoreCase("no")) {
                    System.out.println("Tambahkan Product baru:");
                    System.out.print("Nama Product: ");

                    String namaProduct = scanner.nextLine();

                    System.out.print("Stok Product: ");
                    int stokProduct = scanner.nextInt();

                    System.out.print("Harga Product: ");
                    double hargaProduct = scanner.nextDouble();

                    scanner.nextLine();

                    restaurant.addProduct(new Product(namaProduct, hargaProduct, stokProduct));

                    System.out.println("\ntambah lagi? (yes/no) :");

                    input = scanner.nextLine();
                }
                restaurant.showProduct();
                System.out.println();
            } //add product
            if (userInput == 3) {
                scanner.nextLine();
                System.out.println("ORDER Product");
                while (true){
                    restaurant.showProduct();
                    System.out.println("Pilih Product (By Id) : ");
                    int productId = scanner.nextInt();

                    if (restaurant.getProductById(productId,false) != null){
                        System.out.println("jumlah pembeliab : ");
                        int qty = scanner.nextInt();
                        if (restaurant.getProductById(productId, false).getStok() >= qty ){
                            restaurant.setPenjualans(productId, qty);
                            restaurant.updateQuantity(productId, qty);
                            System.out.println("Selesai Memilih Product ? (yes) : ");

                            scanner.nextLine();
                            String yesNoOption = scanner.nextLine();

                            if (yesNoOption.equals("yes")) break;
                        }else System.out.println("jumlah produk tidak mencukupi\n");
                    }else{
                        System.out.println("Produk tidak Terdaftar\n");
                    }
                }
                if (restaurant.getPenjualans() != null) restaurant.showPenjualan();
            } //order product
            if (userInput == 4) {
                if (restaurant.getProducts() != null) restaurant.showPenjualan();
                else System.out.println(" data Kosong ");
            } //show data penjualan
            if (userInput == 8) {
                restaurant.addProductList(initProduct2());
            } //add product by List
            if (userInput == 9) {
                System.out.println("Delete Product:");
                System.out.print("ID Product: ");
                int idProduct = scanner.nextInt();
                if (restaurant.getProductById(idProduct,true) != null){
                    restaurant.deleteProduct(idProduct);
                }else {
                    System.out.println("Product tidak ditemukan");
                }
            } // delete product
            if (userInput == 10) {
                System.out.println("Update Product:");
                System.out.print("ID Product: ");
                int idProduct = scanner.nextInt();

                if (restaurant.getProductById(idProduct, true) != null) {
                    scanner.nextLine();
                    System.out.print("Nama Product: ");
                    String namaProduct = scanner.nextLine();

                    System.out.print("Stok Product: ");
                    int stokProduct = scanner.nextInt();

                    System.out.print("Harga Product: ");
                    double hargaProduct = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.println();
                    restaurant.updateProduct(new Product(namaProduct, hargaProduct, stokProduct), idProduct);

                } else {
                    System.out.println("Product tidak ditemukan");
                }
            } // update Product

            restaurant.showProduct();
            System.out.println();
        }

    }

    private static List<Product> initProduct() {
        Product[] products = {new Product("Bala-bala", 1000, 17), new Product("Gehu", 1000, 18), new Product("Tahu", 1000, 0), new Product("Molen", 1000, 14), new Product("bakso", 12000, 14)};
        return List.of(products);
    }

    private static List<Product> initProduct2() {
        Product[] products = {new Product("kue", 2500, 12), new Product("ape", 3000, 7), new Product("ayam", 7000, 0), new Product("sapi", 12000, 13), new Product("ikan baka", 12000, 14)};
        return List.of(products);
    }

}

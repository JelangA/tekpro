//
//
//import Tugas.Pertemuan3.tugas2.soal.Product;
//import Tugas.Pertemuan3.tugas2.soal.Penjualan;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//
//    static List<Map> arrayParent = new ArrayList<>();
//
//    static List<Product> arrayList = new ArrayList<>();
//
//    static Map<String, List<Product>> orderMap = new HashMap<>();
//    static Map<String, List<Product>> order2 = new HashMap<>();
//
//
//
//    public static void main(String[] args) {
//
//
//        arrayList.add(new Product("banfkong", 20000, 10));
//        arrayList.add(new Product("ikan", 20000, 10));
//
//
//        orderMap.put("order1", penjualan.getOrderMenu());
//        order2.put("order2", penjualan.getOrderMenu());
//
//        for (int i = 0; i < penjualan.getOrderMenu().size(); i++) {
//            System.out.println(penjualan.getOrderMenu().get(i).getId() +" " + penjualan.getOrderMenu().get(i).getHarga_makanan() + " " + penjualan.getOrderMenu().get(i).getNamaMakanan());
//        }
//
//        arrayParent.add(orderMap);
//        arrayParent.add(order2);
//
//        for (int i =0; i<arrayParent.size(); i++){
//
//            System.out.println(arrayParent.get(i));
//        }
//
//        System.out.println(arrayParent.size());
//
//    }
//}
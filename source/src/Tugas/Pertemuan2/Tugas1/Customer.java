package Tugas.Pertemuan2.Tugas1;

public class Customer {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void order(String customerName, String product, String merchantName){
        System.out.println(customerName +" membeli " + product + " di " + merchantName);
    }

}

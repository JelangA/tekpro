package Encapsulation;

public class EncapTest {
    public static void main(String[] args) {

        Encapsulasi encapsulasi = new Encapsulasi();
        encapsulasi.setName("jelang");
        encapsulasi.setAge("20");
        encapsulasi.setIdNum("231524046");

        System.out.println(
                "name = " + encapsulasi.getName()
                + "\nage = " + encapsulasi.getAge()
                + "\nid = " + encapsulasi.getIdNum()
        );
    }
}


class Encapsulasi{
    private String name;
    private String idNum;
    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

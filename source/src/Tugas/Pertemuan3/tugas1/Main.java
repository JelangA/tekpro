package Tugas.Pertemuan3.tugas1;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Warrior", 65, 60);
        warrior.setStreght(13);
        warrior.displayInfo();
        warrior.attack();
        warrior.takeDamage(8);
        warrior.displayInfo();
        System.out.println();

//        Hero superman = new hero();

        Tank tank = new Tank("Tanker", 75, 19);
        tank.setDefense(15);
        tank.displayInfo();
        tank.attack();
        tank.takeDamage(25);
        tank.displayInfo();
        System.out.println();

        Mage mage = new Mage("Wizard", 40, 60);
        mage.setIntelegence(12);
        mage.displayInfo();
        mage.attack();
        mage.takeDamage(4);
        mage.displayInfo();
        System.out.println();
    }
}

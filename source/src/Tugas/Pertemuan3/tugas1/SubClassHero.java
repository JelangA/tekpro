package Tugas.Pertemuan3.tugas1;

class Warrior extends Hero {
    private int streght;
    public Warrior(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
    @Override
    public void attack() {
        System.out.println(name + " Long Sword Slash!");
    }
    @Override
    public void takeDamage(int damage) {
        health -= damage-(streght/2);
        System.out.println(name + " receives " + (damage-(streght/2)) + " damage.");
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
    public void setStreght(int streght) {
        this.streght = streght;
    }
}

class Tank extends Hero {
    private int defense;
    public Tank(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
    @Override
    public void attack() {
        System.out.println(name + " Shield Canon!");
    }
    @Override
    public void takeDamage(int damage) {
        health -= damage-defense;
        System.out.println(name + " takes " + (damage-defense) + " damage, reduced " + defense + " damage");
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
}

class Mage extends Hero {
    private int intelegence;
    public Mage(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }
    @Override
    public void attack() {
        System.out.println(name + " strikes fire ball magic!");
    }
    @Override
    public void takeDamage(int damage) {
        health -= damage+intelegence;
        System.out.println(name + " is hit with " + (damage+intelegence) + " damage.");
        if (health <= 0) {
            System.out.println(name + " has fallen in battle!");
        }
    }
    public void setIntelegence(int intelegence) {
        this.intelegence = intelegence;
    }
}

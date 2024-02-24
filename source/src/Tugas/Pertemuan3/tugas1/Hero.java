package Tugas.Pertemuan3.tugas1;

public abstract class Hero {
    
    protected String name;
    protected int health;
    protected int attackDamage;

//    void tambahAtribut(String varnama, int varhealt){
//        Atribut atribut = new Atribut(varnama, varhealt);
//        atribut.setName(varnama);
//        atribut.setHealth(varhealt);
//    }

//    public Hero(String name, int health, int attackDamage) {
//        super.setName(name);
//    }

        public Hero(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }
    // Metode Attact untuk memberi serangan
    public abstract void attack();

    // Metode Take damage untuk menerima serangan dari lawan
    public abstract void takeDamage(int damage);

    // Metode untuk menampilkan informasi tentang hero
    public void displayInfo() {
        System.out.println(name);
        System.out.println("Health: " + health);
        System.out.println("Attack Damage: " + attackDamage);
    }
}


package Tugas.Pertemuan3.tugas2.soal3;

class KelasSatu {
    {
        System.out.println(11);                 //3
    }

    static {
        System.out.println(2);                  //2
    }

    public KelasSatu(int i) {
        System.out.println(3);
    }

    public KelasSatu() {
        System.out.println(4);                  //4
    }



}



class KelasDua {
    {
        System.out.println(5);
    }

    public static void main(String[] args) {
        System.out.println(6);                     //1
        KelasSatu satu = new KelasSatu();

        System.out.println();

        KelasSatu dua = new KelasSatu(10);      //
    }
}

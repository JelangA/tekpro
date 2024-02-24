package Tugas.Pertemuan2.Tugas2;

//output Paper size in centimeters: 21.59 by 27.94
class Constant  {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight *
                CM_PER_INCH);
    }
}

//output Paper size in centimeters: 21.59 by 27.94
class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

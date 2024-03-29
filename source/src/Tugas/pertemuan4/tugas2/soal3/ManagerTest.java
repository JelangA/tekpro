package Tugas.pertemuan4.tugas2.soal3;

public class ManagerTest {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        for (int i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (int i = 0; i < 3; i++) staff[i].print();
        System.out.println();

        Employee[] staff2 = new Employee[3];
        staff2[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff2[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff2[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        Sortable.shellSort(staff2);
        for (int i = 0; i < 3; i++) staff2[i].raiseSalary(5);
        for (int i= 0; i < 3; i++) staff2[i].print();
    }
}

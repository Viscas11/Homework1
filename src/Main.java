
public class Main {
    public static void main(String[] args) {
        var count_employee = 640 / 8;
        System.out.println(" Всего работников в компании — " + count_employee + " человек ");
        count_employee = count_employee + 94;
        var count_hour = count_employee * 8;
        System.out.println(" Если в компании работает - " + count_employee + " человек, то всего " + count_hour + " часов работы может быть поделено между сотрудниками ");
    }
}
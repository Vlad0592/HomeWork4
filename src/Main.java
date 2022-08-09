public class Main {
    public static void main(String[] args) {

        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println(" Высокосный год " + i);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            total = total + total /100;
            System.out.println(" Месяц " + i + " Итого " + total);
        }
        System.out.println(total);

        // task1

    }

}
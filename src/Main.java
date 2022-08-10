import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        // task1

        int i = 0;
        while (i < 10) {
            System.out.print(++i + " " );

        }
        System.out.println();

          // task2

            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
             System.out.println();
            // task 2
            int friday = 5;
            for(int current = friday; current < 31; current += 7){
                System.out.println(" Сегодня пятница, " + current + "-е число. Необходимо сделать отчет ");
            }

            //task3
           int CurrentYear = LocalDate.now().getYear();
           int  start = CurrentYear - 200;
           int end = CurrentYear + 100;
            for( int year = start; year < end; year ++){
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
    }

}

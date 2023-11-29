import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();


        boolean isCanBuy = false;

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        if ((first > second) && (first > third)) {
            System.out.println("Наибольший вес: " + first);
        }
        if ((first > second) && (first < third)) {
            System.out.println("Средний вес: " + first);
        }
        if ((first < second) && (first < third)) {
            System.out.println("Наименьший вес: " + first);
        }

        if ((second > first) && (second > third)) {
            System.out.println("Наибольший вес: " + second);
        }
        if ((second > first) && (second < third)) {
            System.out.println("Средний вес: " + second);
        }
        if ((second < first) && (second < third)) {
            System.out.println("Наименьший вес: " + second);
        }

        if ((third > first) && (third > second)) {
            System.out.println("Наибольший вес: " + third);
        }
        if ((third > first) && (third < second)) {
            System.out.println("Средний вес: " + third);
        }
        if ((third < first) && (third < second)) {
            System.out.println("Наименьший вес: " + third);
        }








        //todo


       // System.out.println("Наибольший вес: " + 10);
       // System.out.println("Средний вес: " + 9);
      //  System.out.println("Наименьший вес: " + 1);
    }
}

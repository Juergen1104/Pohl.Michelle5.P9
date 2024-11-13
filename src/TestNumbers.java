// Michelle Pohl

import java.util.Random;

public class TestNumbers {

    /* Aufgabenteil (a) */
    public static void print(Number[] numbers) {

        for (Number number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /* Aufgabenteil (b) */
    public static void sort(Number[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j].compareTo(numbers[j + 1]) > 0) {
                    Number temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int k = 10;
        Number[] brueche = new Number[k];

        /* Aufgabenteil (d) */

        Random random = new Random();

        for (int i = 0; i < brueche.length; i++) {
            int z = random.nextInt(20) + 1;
            int n = random.nextInt(20) + 1;

            brueche[i] = new Bruch(z,n);
        }

        print(brueche);
        sort(brueche);
        print(brueche);
    }
}

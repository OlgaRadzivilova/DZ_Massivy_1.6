import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        // Задание 1

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("The amount expenses for the month was " + sum + " rubles");


        // Задание 2

        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("The minimum amount of spending per day was " + min + " rubles");

        int max = arr[0];
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("The maximum amount of spending per day was " + max + " rubles");

        // Задание 3

        double average = 0;
        double sum1 = 0;
        for (int i : arr) {
            sum1 += i;
            average = sum1 / arr.length;
        }
        System.out.println("The average amount spent for the month was " + average + " rubles");
        return arr;
    }
}








    





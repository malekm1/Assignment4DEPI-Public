public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
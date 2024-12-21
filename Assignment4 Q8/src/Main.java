public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
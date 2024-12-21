public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
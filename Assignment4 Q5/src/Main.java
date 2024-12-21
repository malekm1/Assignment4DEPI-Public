public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        if (numbers.length > 0) {
            int firstElement = numbers[0];
            int lastElement = numbers[numbers.length - 1];
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
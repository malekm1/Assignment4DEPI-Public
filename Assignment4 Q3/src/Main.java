// You can find the length of the array using .length property:

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;

        System.out.println("The length of the array is: " + length);
        System.out.println("The elements in the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
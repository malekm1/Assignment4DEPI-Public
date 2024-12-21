// You can assign values to an array using an initializer list by putting values in {} at the declaration:

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("The array elements are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
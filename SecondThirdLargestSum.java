import java.util.Arrays;

public class SecondThirdLargestSum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = sumOfSecondAndThirdLargest(array);
        System.out.println("Sum of second and third largest numbers: " + sum);
    }

    public static int sumOfSecondAndThirdLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return 0;
        }
        
        Arrays.sort(array);
        int secondLargest = array[array.length - 2];
        int thirdLargest = array[array.length - 3];
        
        return secondLargest + thirdLargest;
    }
}
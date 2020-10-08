import static java.lang.Math.abs;
import static java.lang.Math.min;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        int[] input = {1, 3, 6, 9, 3};
//        int[] input = {10, 2, 10};
        int[] input = {1, 3, 9, 3, 6};
        try {
            System.out.println("Sum = " + sumOfMinAbsDifferences(input));
        } catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Time complexity = O(N)
     * */
    static int sumOfMinAbsDifferences(int[] arr) {
        int length = arr.length;
        if (length < 2) {
            throw new IllegalArgumentException("Array should contain at least 2 elements");
        }

        Arrays.sort(arr);

        int result = 0;
        result += abs(arr[0] - arr[1]);
        result += abs(arr[length - 1] - arr[length - 2]);

        for (int i = 1; i < length - 1; i++) {
            result += min(abs(arr[i] - arr[i - 1]), abs(arr[i] - arr[i + 1])); // Total sum of minimum absolute difference
        }
        return result;
    }
}
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int length = new Random().nextInt(20);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);

        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class ArrayUtil {
    public static void Bubble(int[] arr) {
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length -1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}




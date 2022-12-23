import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    private static int secondLargestElement(int arr[], int n) {
        // int firstLarge, secondLarge;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n - 3];

    }

    private static int secondLargestSort(int arr[], int n) {
        Arrays.sort(arr);
        return arr[n - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargestElement(arr, n));
        System.out.println(secondLargestSort(arr, n));
    }

}

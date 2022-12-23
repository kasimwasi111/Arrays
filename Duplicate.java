import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    private static void findDupBrute(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
        System.out.println();

    }

    // T.C == n^2

    private static void findDupSorting(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // T.C == nlogn

    private static void findDupHashSet(int arr[]) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : arr) {
            if (!set.add(element)) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        findDupBrute(arr);
        findDupSorting(arr);
        findDupHashSet(arr);
    }

}
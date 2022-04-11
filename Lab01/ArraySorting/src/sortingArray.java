import java.util.Scanner;
import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the number of elements in the array.");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array.");
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    double c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        System.out.println("Sorted array by using built-in function:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array by using self-implement program:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum of the array elements = " + sum);
        System.out.println("Average value of the array elements = " + sum/n);
    }
}
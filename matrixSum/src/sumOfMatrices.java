import java.util.Scanner;

public class sumOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in first matrix");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of column in first matrix");
        int m1 = sc.nextInt();
        double[][] arr1 = new double[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.println("array1[" + (i+1) + "][" + (j+1) + "]=");
                arr1[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter the number of rows in the second matrix");
        int n2 = sc.nextInt();
        System.out.println("Enter the number of column in the second matrix");
        int m2 = sc.nextInt();
        if (n1 == n2 && m1 == m2) {
            double[][] arr2 = new double[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.println("array2[" + (i + 1) + "][" + (j + 1) + "]=");
                    arr2[i][j] = sc.nextDouble();
                }
            }

            double[][] result = new double[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    result[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(result[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong dimension! Try again");
        }
    }
}
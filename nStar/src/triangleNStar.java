import java.util.Scanner;
public class triangleNStar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the height of the triangle.");
        int n = keyboard.nextInt();
        for (int row = 1; row <= n; row++){
            for (int space = 1; space <= n-row; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row - 1); star ++ ){
                System.out.print("*");
            }
            if (row != n) {
                System.out.println();
            }
        }

    }
}

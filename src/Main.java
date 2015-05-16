import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String yes = "y";
        String not = "n";
        boolean out = false;
        while (out = true) {
            System.out.println("Fill in the matrix A:");
            int[][] mA = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    mA[i][j] = in.nextInt();
                }
            }
            System.out.println("\nFill in the matrix B:");
            int[][] mB = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    mB[i][j] = in.nextInt();
                }
            }
            int m = mA.length;
            int n = mB[0].length;
            int o = mB.length;
            int[][] mC = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < o; k++) {
                        mC[i][j] += mA[i][k] * mB[k][j];
                    }
                }
            }
            for (int i = 0; i < mC.length; i++) {
                for (int j = 0; j < mC[0].length; j++) {
                    System.out.print(" " + mC[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Do you want repeat this program?\n Enter 1 if yes or 0 if not:");
            int qs;
            qs = in.nextInt();
            if (qs == 1) {
                out = false;
            } else if (qs == 0) {
                break;
            }
        }
    }
}
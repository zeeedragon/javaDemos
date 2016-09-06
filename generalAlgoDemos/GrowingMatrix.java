package generalAlgoDemos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GrowingMatrix {
    public static void read(int[][] a) {
        Random generate = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = generate.nextInt(100);
            }
        }
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static int sumElements(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }

    public static boolean isGrowing(int[] a) {
        int i = 1;
        while (i < a.length && a[i - 1] <= a[i]) {
            i++;
        }
        return i == a.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        int[][] matrix = new int[n][m];
        int[] sums = new int[n];
        read(matrix);
        print(matrix);
        int weight = 0;

        for (int i = 0; i < n; i++) {
            sums[i] = sumElements(matrix[i]);
            weight += sums[i];
        }

        System.out.println(Arrays.toString(sums));
        if (isGrowing(sums)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

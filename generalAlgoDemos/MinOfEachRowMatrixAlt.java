package generalAlgoDemos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinOfEachRowMatrixAlt {

    public static void read(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static int minElement(int[] a) {
        int min = a[0];
        for (int n : a) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        int[][] matrix = new int[n][m];
        int[] mins = new int[n];
        read(matrix);
        print(matrix);
        for(int i = 0; i < n; i++) {
            mins[i] = minElement(matrix[i]);
        }
        Arrays.sort(mins);
        System.out.println(Arrays.toString(mins));
    }
}

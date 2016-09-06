package generalAlgoDemos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();

        int[][] a = new int[n][m];
        fill(a);
        print(a);

        //declare array to store min values
        int[] minValues = new int[n];

        //fill in the minValues array as you call the min method for each line of the array "a"

        for (int i = 0; i < n; i++) {
            minValues[i] = min(a[i]);
        }

        Arrays.sort(minValues);
        System.out.println(Arrays.toString(minValues));
    }

    public static void fill(int[][] z) {
        Random rand = new Random();
        //z.length returns number of rows
        //z[0].length returns number of cols
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void print(int[][] z) {
        for (int i = 0; i < z.length; i++) {
            System.out.println(Arrays.toString(z[i]));
        }
    }

    public static int min(int[] z) {
        int min = Integer.MAX_VALUE;
        for (int n : z) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

}

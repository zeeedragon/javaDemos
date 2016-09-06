package generalAlgoDemos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinOfEachRowMatrix {
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

    public static void seekMins(int[][] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            int j = 1;
            int min = a[i][0];
            for(j = 1; j < a[i].length; j++) {
                if(min > a[i][j]) {
                    min = a[i][j];
                }
            }
            b[i] = min;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        int[] mins = new int[n];
        in.close();
        read(matrix);
        print(matrix);
        seekMins(matrix, mins);
        Arrays.sort(mins);
        System.out.println(Arrays.toString(mins));
    }
}

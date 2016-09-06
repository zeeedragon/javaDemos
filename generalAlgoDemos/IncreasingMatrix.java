package generalAlgoDemos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static sun.misc.Version.print;

public class IncreasingMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        in.close();

        int[][] a = new int[n][m];

        fill(a);
        print(a);

        //declare array to store sums of each Sum
        int[] sumsForAllLines = new int[n];
        int[] sumsForAllLinesCOPY = new int[n];

        //fill in the sums array as you call the sum method for each line of array "a"
        for (int i = 0; i < n; i++) {
            sumsForAllLines[i] = sum(a[i]);
            sumsForAllLinesCOPY[i] = sumsForAllLines[i];
        }

        System.out.println(Arrays.toString(sumsForAllLines));
        System.out.println(Arrays.toString(sumsForAllLinesCOPY));

        //sorting the copy array
        Arrays.sort(sumsForAllLinesCOPY);
        System.out.println(Arrays.toString(sumsForAllLinesCOPY));

        //checking if increasing
        if (Arrays.equals(sumsForAllLinesCOPY, sumsForAllLines)) {
            int weight = 0;
            for (int i = 0; i < sumsForAllLines.length; i++) {
                weight += sumsForAllLines[i];
            }
            System.out.println(weight);
        } else {
            System.out.println("No");
        }
    }

    public static void fill(int[][] z) {
        Random rand = new Random();
        //z.length returns number of rows
        //z[0].length returns number of cols
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) { //z[i].length if each has different number of cols
                z[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void print(int[][] z) {
        for (int i = 0; i < z.length; i++) {
            System.out.println(Arrays.toString(z[i]));
        }
    }

    public static int sum(int[] z) {
        int sumLine = 0;
        for (int n : z) {
            sumLine += n;
        }
        return sumLine;
    }
}

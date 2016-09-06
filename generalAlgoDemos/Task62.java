package generalAlgoDemos;

//ДСП, която запълва две последователности от числа със случайни ,
// отпечатва ги, сортира ги, отпечатва ги сортирани и след това
// ги смесва сортирано (по този начин смесената
// последователност е сортирана)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task62 {

    public static void read(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
    }

    public static void merge(int[] x, int[] y, int[] z) {
        int i = 0, j = 0, k = 0;
        while (i < x.length && j < y.length) {
            if (x[i] < y[j]) {
                z[k] = x[i];
                i++;
            } else {
                z[k] = y[j];
                j++;
            }
            k++;
        }
        while (i < x.length) {
            z[k] = x[i];
            i++;
            k++;
        }
        while (j < y.length) {
            z[k] = y[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount1 = in.nextInt();
        int amount2 = in.nextInt();
        in.close();
        int[] a = new int[amount1];
        read(a);
        System.out.println(Arrays.toString(a));
        int[] b = new int[amount2];
        read(b);
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int[] ab = new int[amount1 + amount2];
        merge(a, b, ab);
        System.out.println(Arrays.toString(ab));
    }
}

package generalAlgoDemos;

//ДСП, която запълва матрица с n реда и m стълба със случайни числа,
// отпечатва матрицата, чете от клавиатурата позицията на произволен
// елемент и отпечатва средното аритметично на съседните му
// елементи (в общия случай са 8).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task59 {
    public static void fill(int[][] z) {
        Random rand = new Random();
        //z.length returns number of rows
        //z[0].length returns number of columns
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

    public static double average(int x, int y, int[][] z) {
        int[][] displace = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}}; //matrix if neighbours
        int br = 0;
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            int posX = x + displace[i][0];
            int posY = y + displace[i][1];
            if (posX >= 0 && posY < z.length && posY >= 0 && posY < z[0].length) {
                sum += z[posX][posY];
                br++;
            }
        }
        return sum / br;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        fill(a);
        print(a);
        int positionX = in.nextInt();
        int positionY = in.nextInt();
        System.out.printf("%.3f%n", average(positionX, positionY, a));
    }
}

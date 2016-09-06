package generalAlgoDemos;

import java.util.Scanner;

public class GreatestPrimeInInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        while (b >= a && !prime(b)) {
            b--;
        }
        System.out.println(b >= a ? b : "No");
    }

    public static boolean prime(int x) {
        int i = x / 2;
        while (x % i != 0) {
            i--;
        }
        return i == 1;
    }
}

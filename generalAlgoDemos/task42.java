package generalAlgoDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class task42 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());

        //reading
        ArrayList<Integer> allInput = new ArrayList<>();
        HashSet<Integer> repeating = new HashSet<>();
        while (input != 0) {
            allInput.add(input);
            input = Integer.parseInt(in.nextLine());
        }
        for (Integer el : allInput) {
            System.out.print(el + " ");
        }
        System.out.println();

        //max element
        //min element
        //intermediate sum
        //even and odd count

        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;
        int countOdd = 0;
        int sumInProgress = 0;

        for (int el : allInput) {
            sumInProgress += el;
            System.out.println("Intermediate sum " + sumInProgress);
            if (el % 2 != 0) {
                countOdd++;
            }
            if (el > maxEl) {
                maxEl = el;
            }
            if (el < minEl) {
                minEl = el;
            }
        }
        System.out.println("Max element " + maxEl);
        System.out.println("Min element " + minEl);
        System.out.println("Count odd " + countOdd);
        System.out.println("Count even " + (allInput.size() - countOdd));

        for (int i = 1; i < (allInput.size() - 1); i++) {
            if (allInput.get(i - 1) == allInput.get(i) || allInput.get(i) == allInput.get(i + 1)) {
                repeating.add(allInput.get(i));
            }
        }
        System.out.print("Neighbouring duplicates - unique values: ");
        System.out.println(repeating);
    }
}

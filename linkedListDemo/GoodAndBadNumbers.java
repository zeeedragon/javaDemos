package linkedListDemo;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class GoodAndBadNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> good = new LinkedList<>();
        LinkedList<Integer> bad = new LinkedList<>();
        Integer n = in.nextInt();

        while (n != 0) {
            if (good.remove(n)) {
                bad.add(n);
                System.out.println("Bad");
            } else if (bad.contains(n)) {
                System.out.println("Bad");
            } else {
                good.add(n);
                System.out.println("Good");
            }
            n = in.nextInt();
        }

        System.out.println(good);
        System.out.println(bad);
        printReverse(good);
    }

    public static void printReverse(LinkedList<Integer> list){
        ListIterator<Integer> itr = list.listIterator(list.size());
        while(itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
        System.out.println();
    }
}

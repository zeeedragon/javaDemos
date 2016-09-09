package softuni.setsDemo;

//enter words for dictionary until you enter '.'
//enter random words
//print dictionary a-z; and the 2 entry in reversed order
//after that in a-z - all unknown word

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SpellCheck {
    public static void main(String[] args) {
        TreeSet<String> dict = makeSet();
        TreeSet<String> input = makeSet();
        printAsc(dict);
        printDesc(input);
        printUnknown(dict, input);
    }

    public static TreeSet<String> makeSet() {
        Scanner in = new Scanner(System.in);
        TreeSet<String> temp = new TreeSet<>();
        String word = in.nextLine();
        while (!word.equals(".")) {
            temp.add(word);
            word = in.nextLine();
        }
        return temp;
    }

    public static void printAsc(TreeSet<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
    }

    public static void printDesc(TreeSet<String> set) {
        Iterator<String> itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
    }

    public static void printUnknown(TreeSet<String> set1, TreeSet<String> set2) {
        Iterator<String> itr = set2.iterator();
        while (itr.hasNext()) {
            String temp = itr.next();
            if (!set1.contains(temp)) {
                System.out.println(temp + " " + set1.floor(temp) + ", " + set1.ceiling(temp));
            }
        }
    }
}

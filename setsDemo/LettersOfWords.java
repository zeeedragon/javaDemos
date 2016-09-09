package softuni.setsDemo;

//enter 2 words
//print letters of first and second
//common letters
//yes - if letters of first word are letters of second word
//sample input  - apple - add
//a p l e
//a d
//a
//a p l e d
//NO

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class LettersOfWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.nextLine();
        String word2 = in.nextLine();

        HashSet<Character> set1 = makeSet(word1);
        HashSet<Character> set2 = makeSet(word2);

        System.out.println(set1);
        System.out.println(set2);

        in.close();

        System.out.println(blendSet(set1, set2));
        printAll(set1, set2);
        System.out.println();
        System.out.println(subWord(set1, set2) ? "Yes" : "No");
    }

    public static HashSet<Character> makeSet(String word) {
        HashSet<Character> tempSet = new HashSet<Character>();
        int length = word.length();

        for (int i = 0; i < length; i++) {
            tempSet.add(word.charAt(i));
        }
        return tempSet;
    }

    public static HashSet<Character> blendSet(HashSet<Character> set1, HashSet<Character> set2) {
        HashSet<Character> tempSet = new HashSet<Character>();
        HashSet<Character> smallSet = set1.size() < set2.size() ? set1 : set2;
        HashSet<Character> bigSet = set1.size() < set2.size() ? set2 : set1;

        Iterator<Character> itr = smallSet.iterator();
        while (itr.hasNext()) {
            Character ch = itr.next();
            if (bigSet.contains(ch)) {
                tempSet.add(ch);
            }
        }
        return tempSet;
    }

    public static void printAll(HashSet<Character> set1, HashSet<Character> set2) {
        Iterator<Character> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        itr = set2.iterator();

        while (itr.hasNext()) {
            Character temp = itr.next();
            if (!set1.contains(temp)) {
                System.out.print(temp + " ");
            }
        }
    }

    public static boolean subWord(HashSet<Character> set1, HashSet<Character> set2) {
        Iterator<Character> itr = set1.iterator();
        while (itr.hasNext()) {
            if (!set2.contains(itr.next())) {
                return false;
            }
        }
        return true;
    }
}

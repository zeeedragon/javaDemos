package softuni.mapsDemo;

import java.util.*;

public class FrequencyDictionaryV2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapIn = new HashMap<>();
        readMap(mapIn);
        //constructor by default - order acs
        //TreeMap<Integer, TreeSet<String>> mapOut = new TreeMap<Integer, TreeSet<String>>();
        //constructor for desc - reversed order
        TreeMap<Integer, TreeSet<String>> mapOut = new TreeMap<Integer, TreeSet<String>>(Collections.reverseOrder());
        makeOut(mapIn, mapOut);
        printByFrequency(mapOut);
    }

    public static void readMap(HashMap<String, Integer> map) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        while (!word.equals(".")) {
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                count++;
                map.put(word, count);
            }
            word = in.nextLine();
        }
        in.close();
    }

    public static void makeOut(HashMap<String, Integer> mapIn, TreeMap<Integer, TreeSet<String>> mapOut) {
        //loop over the entries of original map
        Iterator<Map.Entry<String, Integer>> itrIn = mapIn.entrySet().iterator();
        while (itrIn.hasNext()) {
            // define current entry and its elements
            Map.Entry<String, Integer> entry = itrIn.next();
            String currentWord = entry.getKey();
            Integer currentFrequency = entry.getValue();
            // using temp set of words for current key(which is the frequency of the new TreeMap)
            TreeSet<String> wordsSet = mapOut.get(currentFrequency);
            if (wordsSet == null) {
                // if the TreeSet is empty(null) it needs to be defined
                wordsSet = new TreeSet<>();
                wordsSet.add(currentWord);
                mapOut.put(currentFrequency, wordsSet);
            } else {
                // already a word present for this frequency, thus adding the
                // current word to the TreeSet
                wordsSet.add(currentWord);
                mapOut.put(currentFrequency, wordsSet);
            }
        }
    }

    public static void printByFrequency(TreeMap<Integer, TreeSet<String>> map) {
        // print all words that appear once
        // aa, bb, dd, aa, bb, cc, bb, bb
        // print 1 - dd, cc; 2 - aa; 4 - bb
        Iterator<Map.Entry<Integer, TreeSet<String>>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, TreeSet<String>> currentEntry = itr.next();
            Integer currentFrequency = currentEntry.getKey();
            TreeSet<String> currentWordSet = currentEntry.getValue();
            System.out.print(currentFrequency + " ");
            printSetWords(currentWordSet);
            System.out.println();
        }
    }

    public static void printSetWords(TreeSet<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ";");
        }
    }
}

package softuni.mapsDemo;
//enter words until '.' is entered

import java.util.*;

public class FrequencyDictionary {
    public static void main(String[] args) {
        //to support asc
        //TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        //to support desc
        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        readMap(map);
        printMap(map);
    }

    public static void readMap(TreeMap<String, Integer> map) {
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

    public static void printMap(TreeMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> current = itr.next();
            System.out.println(current.getKey() + " - " + current.getValue());
        }
    }

    public static void printMostFrequent(TreeMap<String, Integer> map) {
        //HOMEWORK - sort by frequency of the Count - prints most frequent, second most frequent etc

    }
}

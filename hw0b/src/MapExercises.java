package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch = 97; ch <= 122; ch++) {
            // Map the character to its corresponding number
            map.put(ch, ch - 'a' + 1);  // 'a' corresponds to 1, 'b' to 2, etc.
        }

        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer,Integer> rt = new HashMap<>();
        for(Integer a : nums){
            rt.put(a,a*a);
        }
        return rt;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words){
        Map<String, Integer> rt = new HashMap<>();

        for (String w : words) {
            // If the word is already in the map, increment the count
            // If the word is not in the map, add it with a count of 1
            rt.put(w, rt.getOrDefault(w, 0) + 1);
        }

        return rt;
    }
}

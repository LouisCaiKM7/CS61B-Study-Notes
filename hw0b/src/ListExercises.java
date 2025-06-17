package src;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    public static int sum(List<Integer> L) {
        int sum = 0;
        for (Integer integer : L) {
            sum += integer;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        var rtList = new ArrayList<Integer>();  // List to hold the even numbers
        for (Integer integer : L) {
            if (integer % 2 == 0) {  // Check if the number is even
                rtList.add(integer);  // Add the even number to the result list
            }
        }
        return rtList;
    }


    /** Returns a list containing the common items of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        var rt = new ArrayList<Integer>();  // List to store common items
        // Get the current element from L1
        for (int temp : L1) {  // Loop through the first list
            if (L2.contains(temp)) {  // Check if L2 contains this element
                rt.add(temp);  // If so, add it to the result list
            }
        }
        return rt;  // Return the list of common elements
    }



    /** Returns the number of occurrences of the given character in a list of strings. */
    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int ct = 0;
        // Iterate through each word in the list
        for (String word : words) {
            // Iterate through each character in the word
            for (char k : word.toCharArray()) {
                // If the character matches, increment the count
                if (k == c) {
                    ct++;
                }
            }
        }
        return ct;  // Return the total count
    }
}

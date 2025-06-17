package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {
    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        ArrayList<Integer> tempList = new ArrayList<>();  // Create an empty ArrayList
        int i = 1;
        while(i <= 6) {
            tempList.add(i);  // Add values 1 to 6 to the ArrayList
            i++;
        }

        return tempList.stream().mapToInt(Integer::intValue).toArray();  // Return the int[] array
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        ArrayList<String> order = new ArrayList<String>();
        if(customer.equals("Ergun")){
            order.add("beyti");
            order.add("pizza");
            order.add("hamburger");
            order.add("tea");
        }
        else if (customer.equals("Erik")){
            order.add("sushi");
            order.add("pasta");
            order.add("avocado");
            order.add("coffee");
        }
        else {
            for(int i = 0; i<3; i++){
                order.add("");
            }
        }

        return order.toArray(new String[0]);
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        return FindMax(array)-FindMin(array);

    }
    public static int FindMax(int[] array){
        return Arrays.stream(array).max().orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }
    public static int FindMin(int[] array){

        return Arrays.stream(array).min().orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }
    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // Base case: when x becomes 1, stop the recursion
        list.add(x);
        if (x == 1) {
            return list;
        }

        // Recursively call hailstoneHelper
        if (x % 2 == 0) {
            return hailstoneHelper(x / 2, list);
        } else {
            return hailstoneHelper(x * 3 + 1, list);
        }
    }


 }
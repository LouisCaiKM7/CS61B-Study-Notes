import javax.tools.JavaCompiler;

/**
 * Skeleton file for HW0A.
 * Exercises sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */
public class JavaExercises {

    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle() {
        int wanted_line = 5;
        for(int j=0; j<wanted_line; j++){
            printStar(j+1);
            System.out.print("\n");
        }
    }
    public static void printStar(int number){
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
    }


    /**
     * Prints each character of a given string followed by its reverse index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        for(int i = 0; i<s.length(); i++){
            System.out.print(stringToPrint(s)[i]);
            System.out.print(getLength(s)[i]);
        }
        System.out.println();
    }
    public static char[] stringToPrint(String string){
        char[] charArray = new char[string.length()];
        for(int i = 0; i<string.length(); i++){
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }
    public static int[] getLength(String string){
        int[] numList = new int[string.length()];
        int j = 0;
        for (int i= string.length(); i >0; i--){
            numList[j]=i;
            j++;
        }
        return numList;
    }

    /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: stutter("hello") -> "hheelllloo"
     */
    public static String stutter(String s) {
        String toPrint= "";
        for(int i = 0; i<s.length(); i++){
            toPrint+=stringToPrint(s)[i];
            toPrint+=stringToPrint(s)[i];
        }
        return toPrint;
    }

    /**
     * Determines the quadrant of a Cartesian coordinate (x, y).
     * Returns:
     *   1 for the first quadrant (x > 0, y > 0),
     *   2 for the second quadrant (x < 0, y > 0),
     *   3 for the third quadrant (x < 0, y < 0),
     *   4 for the fourth quadrant (x > 0, y < 0),
     *   0 if the point lies on an axis.
     */
    public static int quadrant(int x, int y) {
        if(x>0 && y>0){
            return 1;
        }else if (x<0 && y>0){
            return 2;
        } else if (x<0 && y<0) {
            return 3;
        }else if(x>0 && y<0){
            return 4;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4));  // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5));  // Output: 0
        System.out.println(quadrant(5, 0));  // Output: 0
    }
}

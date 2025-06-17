package src;

public class Dessert {
    private int x;
    private int y;
    private static int count = 0;

    public Dessert(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public void printDessert() {
        System.out.println(x + " " + y + " " + count);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}

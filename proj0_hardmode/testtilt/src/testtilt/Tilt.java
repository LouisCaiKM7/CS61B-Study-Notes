package testtilt;

import java.util.ArrayList;

public class Tilt {

    public static void tryTilt(int[][] board, Side side) {
        if (side == Side.NORTH) {
            board = up(board);
        } else if (side == Side.SOUTH) {
            board = down(board);
        } else if (side == Side.WEST) {
            board = left(board);
        } else { // EAST
            board = right(board);
        }
    }

    public static int[][] up(int[][] input) {
        ArrayList<Integer> nothing = new ArrayList<>();
        nothing.add(0);
        nothing.add(0);
        nothing.add(0);
        nothing.add(0);

        ArrayList<ArrayList<Integer>> character = new ArrayList<>();

        // 复制 input 到 character
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(input[i][j]);
            }
            character.add(temp);
        }

        // 移除第一行，添加新的一行
        character.removeFirst();
        character.add(nothing);

        System.out.println(character); // 调试用

        // 转换回 int[][]
        int[][] output = new int[4][4];
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = character.get(i);
            for (int j = 0; j < 4; j++) {
                output[i][j] = row.get(j);
            }
        }

        return output;
    }

    public static int[][] down(int[][] input) {
        ArrayList<Integer> nothing = new ArrayList<>();
        nothing.add(0);
        nothing.add(0);
        nothing.add(0);
        nothing.add(0);

        ArrayList<ArrayList<Integer>> character = new ArrayList<>();

        // 复制 input 到 character
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(input[i][j]);
            }
            character.add(temp);
        }

        // 移除最后一行，添加新的一行到最上面
        character.remove(3);
        character.addFirst(nothing);

        System.out.println(character); // 调试用

        // 转换回 int[][]
        int[][] output = new int[4][4];
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = character.get(i);
            for (int j = 0; j < 4; j++) {
                output[i][j] = row.get(j);
            }
        }

        return output;
    }

    public static int[][] left(int[][] input) {
        ArrayList<ArrayList<Integer>> character = new ArrayList<>();

        // 复制 input 到 character
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(input[i][j]);
            }
            // 移除最左边一列，加一个 0 到最右边
            temp.removeFirst();
            temp.add(0);
            character.add(temp);
        }

        System.out.println(character); // 调试用

        // 转换回 int[][]
        int[][] output = new int[4][4];
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = character.get(i);
            for (int j = 0; j < 4; j++) {
                output[i][j] = row.get(j);
            }
        }

        return output;
    }

    public static int[][] right(int[][] input) {
        ArrayList<ArrayList<Integer>> character = new ArrayList<>();

        // 复制 input 到 character
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(input[i][j]);
            }
            // 移除最右边一列，加一个 0 到最左边
            temp.remove(3);
            temp.addFirst(0);
            character.add(temp);
        }

        System.out.println(character); // 调试用

        // 转换回 int[][]
        int[][] output = new int[4][4];
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = character.get(i);
            for (int j = 0; j < 4; j++) {
                output[i][j] = row.get(j);
            }
        }

        return output;
    }

}

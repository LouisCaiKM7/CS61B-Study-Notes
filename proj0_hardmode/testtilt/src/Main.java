import testtilt.Side;
import testtilt.Tilt;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int[][] input = new int[][]{{0,0,0,0},{0,0,0,0},{0,0,2,2},{0,0,0,0}};
        int[][] output = new int[4][4];
        Tilt.tryTilt(input,Side.SOUTH);
    }
}
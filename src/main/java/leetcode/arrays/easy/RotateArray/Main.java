package leetcode.arrays.easy.RotateArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2};
        solution.rotate(array, 4);
        System.out.println(Arrays.toString(array));
    }
}

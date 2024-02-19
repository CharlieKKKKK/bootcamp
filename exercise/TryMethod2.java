package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {

        int[] nums = new int[] { 0, 1, 2, 3, 4 };
        int[] index = new int[] { 0, 1, 2, 2, 1 };
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            temp.add(index[i], nums[i]);
        }
        System.out.println(temp);

        int[] Output = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            Output[i] = temp.get(i);
        }

        System.out.println(Arrays.toString(Output));
    }
}
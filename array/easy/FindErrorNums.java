package array.easy;

import java.util.Arrays;

/**
 * @source: leetcode645
 * @difficulty: easy
 * @topic: 错误的集合
 * @link: https://leetcode.cn/problems/set-mismatch/
 * @description: 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
 * 导致集合 丢失了一个数字 并且 有一个数字重复 。给定一个数组 nums 代表了集合 S 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * @input: nums = [1,2,2,4]
 * @output: [2,3]
 * @requirements:
 */
public class FindErrorNums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }

    public static int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int[] helper = new int[length + 1];
        int[] ret = new int[2];
        for (int num : nums) {
            helper[num]++;
        }
        for (int i = 1; i < length + 1; i++) {
            System.out.println(helper[i]);
            if (helper[i] == 2) {
                ret[0] = i;
            }
            if (helper[i] == 0) {
                ret[1] = i;
            }
        }
        return ret;
    }
}

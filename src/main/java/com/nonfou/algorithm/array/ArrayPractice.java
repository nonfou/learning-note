package com.nonfou.algorithm.array;

import java.util.Arrays;

/**
 * 数组
 */
public class ArrayPractice {


    public static void main(String[] args) {
        // removeEle test
        int[] nums1 = {1, 5, 9, 12, 1, 2, 3, 5};
        System.out.println(removeEle(nums1, 5));

        // binary search test
        int[] nums2 = {1, 2, 6, 9, 15, 26, 27};
        System.out.println(binarySearch(nums2, 7));
        System.out.println(binarySearch(nums2, 9));

        // sortedSquares
        int[] nums3 = {-4, -2, 2, 6, 8, 15};
        System.out.println(Arrays.toString(sortedSquares(nums3)));
    }

    /**
     * <html><a href="https://leetcode.cn/problems/remove-element/">...</a></html>
     *
     * @param nums 数组
     * @param val  要移除的元素
     * @return 新数组的大小
     */
    public static int removeEle(int[] nums, int val) {
        int slowIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {

            } else {
                nums[slowIndex] = nums[i];
                slowIndex++;
            }
        }

        return slowIndex;
    }

    /**
     * 二分查找
     *
     * @param nums 数组
     * @param val  要查找的元素
     * @return 下标或-1
     */
    public static int binarySearch(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (val > nums[middle]) {
                left = middle + 1;
            } else if (val < nums[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }


    /**
     * <html><a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">...</a></html>
     * 有序数组的平方
     *
     * @param nums 有序数组
     * @return 平方数组
     */
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        int p = result.length - 1;
        while (left <= right) {
            int leftPlus = nums[left] * nums[left];
            int rightPlus = nums[right] * nums[right];

            if (leftPlus < rightPlus) {
                result[p] = rightPlus;
                right--;
            } else {
                result[p] = leftPlus;
                left++;
            }

            p--;
        }

        return result;
    }
}

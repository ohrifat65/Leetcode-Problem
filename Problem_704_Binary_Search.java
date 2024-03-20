/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author wwe
 */
public class Problem_704_Binary_Search {

    public int search(int[] nums, int target) {

        int ArraySize = nums.length;
        int left = 0;
        int right = ArraySize - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {

                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        int []x={};
        int d=new Problem_704_Binary_Search().search(x, 2);
        System.out.println(d);
    }
}

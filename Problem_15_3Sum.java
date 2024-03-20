package leetcode;

class Solution {
    public int[] threeSum(int[] nums) {
        int operation =0;
        int N=nums.length;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k= j+1; j < N; k++) {
                    operation++;
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
        
        System.out.println(operation);
     return nums;
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        Solution sol=new Solution();
        int []num={-1,0,1,2,-1,-4};
        sol.threeSum(num);
//        List<List<Integer>> s = sol.threeSum(num);
        
    }
}
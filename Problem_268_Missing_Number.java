package leetcode;

public class Problem_268_Missing_Number {

    public int missingNumber(int[] nums) {
        
        //---sorting nums array 
        for (int i = 0; i < nums.length-1; i++) {
            int item=nums[0];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        
        for (int i = nums[0]; i < nums[nums.length-1]; i++) {
            if (nums[i]!=i) {
                return i;
            }
        }
        
        
        
        return 0;
    }

    public static void main(String[] args) {

        Problem_268_Missing_Number ob = new Problem_268_Missing_Number();

        int[] A = {9,6,4,2,3,5,7,0,1};

        System.out.println("Missing Number : " + ob.missingNumber(A));
        
    }
}

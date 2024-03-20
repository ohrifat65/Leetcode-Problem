package leetcode;

class Solution9 {

    public boolean isPalindrome(int x) {
        int temp = x;
        int r=0;  // --Remainder
        int reverse = 0;
        while (temp > 0) {
            r = temp % 10;
            reverse = reverse * 10 + r;
            temp = temp / 10;
        }
        if (x == reverse) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution9 ob = new Solution9();
        System.out.println(ob.isPalindrome(121));
    }
}

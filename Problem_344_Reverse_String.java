package leetcode;

class Solution344{
    public static void reverseString(char[] s) {
                int start =0;
        int end =s.length-1;
        
        while(start<end){
            char temp =s[start];
            s[start]=s[end];
            s[end]=temp;
            
            start++;
            end--;
        }

//4496765
    }
}
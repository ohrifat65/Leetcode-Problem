class Solution {

    public  String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];
            String rv = "";
            for (int j = s1.length() - 1; j >= 0; j--) {
                rv = rv + s1.charAt(j);

            }

            if (s1.equals(rv)) {
                return rv;
            }
        }

        return "";
    }
}
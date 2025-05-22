// https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
// toChars()
// toLowerCase()
// two pointers pattern

// remove spaces
// check if alphanumerical.
//      reggex or isLetterOrDigit()

// convert to lowercase first
// remove all non-alphanumeric
// two pointers pattern


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
}
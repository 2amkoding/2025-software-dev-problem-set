//Divide problem into 2 categories: Left(products of prefix) & Right(products of suffix)


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int lengthOfNums = nums.length;
        int[] answer = new int[lengthOfNums];
        int left = 1;
        int right = 1;

        for (int i = lengthOfNums - 1; i >= 0; i--) {
            answer[i] = right;
            right *= nums[i];
        }
        //answer = [24, 12, 4, 1]

        for (int j = 0; j < lengthOfNums; j++) {
            answer[j] *= left;
            left *= nums[j];
        }
        //final answer = [24, 12, 8, 6]

        return answer;
    }
}
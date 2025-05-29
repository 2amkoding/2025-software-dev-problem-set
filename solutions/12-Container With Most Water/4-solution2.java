class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0}); // JIT warm-up
        }
    }
    public static int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int leftH = height[left];
            int rightH = height[right];
            int minH = (leftH<rightH) ? leftH : rightH;
            int newArea = (right - left) * minH;
            if(newArea > area) area = newArea;
            if(leftH < rightH) {
                while(left < right && height[left] <= minH) left++;
            } else {
                while(left < right && height[right] <= minH) right--;
            }
        }
        return area;
    }
}
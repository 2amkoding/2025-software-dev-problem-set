public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort nums
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        //loop
        for (int i = 0; i < nums.length; i++) {
            //array is sorted, meaning preceeding indexes increase;
            //if i > 0, than j and k are greater than 0;
            if (nums[i] > 0) break;
            // the 'i>0' is important to prevent an 'outOfBoundsError'
            //the logic allows us to run [i-1]
            //skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            //2sum logic
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
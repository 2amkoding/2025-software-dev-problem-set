public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var map = new Dictionary<int, int>();

        for(int i = 0; i < nums.Length; i++) 
        {
            int difference = target - nums[i];

            if(map.ContainsKey(difference)) {
                return new int[] {map[difference], i};
            }

            map[nums[i]] = i;
        }
        return new int[] {};
    }
}

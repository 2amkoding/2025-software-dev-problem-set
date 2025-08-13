class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> mapper = new HashMap<>();

        for(int left = 0; left < nums.length; left++) {
            int right = target - nums[left];

            if(mapper.containsKey(right)) {
                return new int[] { mapper.get(right), left };
            }

            mapper.put(nums[left], left);
        }

        return new int[0];
    }
}
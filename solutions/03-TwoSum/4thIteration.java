class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> mapper = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(mapper.containsKey(difference)) {
                return new int[] { mapper.get(difference), i };
            }

            mapper.put(nums[i], i);
        }

        return new int[0];
    }
}
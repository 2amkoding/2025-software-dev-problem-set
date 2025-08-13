class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> mapper = new HashSet<>();

        for(int n: nums) {
            if(mapper.contains(n)) return true;

            mapper.add(n);
        }

        return false;
    }
}
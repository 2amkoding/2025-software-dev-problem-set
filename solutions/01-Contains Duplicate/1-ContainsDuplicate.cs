public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        
        HashSet<int> nums1 = new HashSet<int>();

        foreach(int num in nums){
            if(nums1.Contains(num))
            {
                return true;
            }
            nums1.Add(num);
        }
        return false;
    }
}

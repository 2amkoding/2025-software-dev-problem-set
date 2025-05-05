//problem:
    // Given an unsorted Array, find the length of the longest consecutive sequence
    // Must solve in O(n)

//Strategy: HashSet
    // 1. Add all elements to a HashSet
    // 2. Loop thru each N, only count if start of sequence
        // if num - 1 not in set
    // 3. Count up consecutive elements
        // num+1, num+2,... -> length
    // 4. Track longest streak

//Why O(n)
    // Each num is processed at most once

//Visual
    //Hashset
    //  HashSet<E> uses HashMap<E, Object>
    //  Stores Values ONLY as Keys
    //  Abstracts away the value as UIDs

    //Example:
    //  array = [100, 4, 200,  1, 3, 2, 2]

    //  set.add(100) -> map.put(100,PRESENT)
    //      set = [100]
    //  set.add(4) -> map.put(4,PRESENT)
    //      set = [100, 4]
    //  set.add(200) -> map.put(200,PRESENT)
    //  set.add(1) -> map.put(1,PRESENT)
    //  set.add(3) -> map.put(3,PRESENT)
    //  set.add(2) -> map.put(2,PRESENT)
    //      set = [100, 4, 200, 1, 3, 2]
    //  set.add(2) -> Already exists, SKIP
    //      set = [100, 4, 200, 1, 3, 2]

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        //next
    }
}
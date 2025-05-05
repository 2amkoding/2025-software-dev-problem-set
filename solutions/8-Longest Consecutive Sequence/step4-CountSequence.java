//Determine the starting value before counting sequence.

//Starting value
    // given Set[val1, valu2, etc]
    //  Loop thru set, if currentValue - 1 exists, currentValue cannot be the startingValue.
    // currentSequence stays at 1. We are not interested in calculating sequence until finding the startingValue

//Count Sequence
// if currentValue + 1 exists, ++currentSequence
// update HighestRecordOfSequence
// Compare HighestRecordOfSequence vs currentSequence

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;


    }
}
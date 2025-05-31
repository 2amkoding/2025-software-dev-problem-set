//INTUITION
/*
1. Count  the frequency of each  element.
2. Sort the elements based on their frequency.
3. Select the top k elements w the highest frequency.
*/

//APPROACH
/*
 1. Sort input array nums, iterate through its elmeents, and add pairs to a collection numsCount.
    ex: [1,2,3,2,1,1,3] -> [1,1,1,2,2,3] -> [1,3], [2,2], [3,1]
 2. Sort the collection by first index in descending order.
 3. Iterate through pre-created result array of length k, add elements from beginning of the numsCount collection
*/


class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        List<int[]> numsCount = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = 1;

            while(i + 1 < nums.length && nums[i + 1] == first) {
                second++;
                i++;
            }
            numsCount.add(new int[]{first, second});
        }

        Collections.sort(numsCount, (a, b) -> Integer.compare(b[1], a[1]));

        for(int i = 0; i < result.length; i++) {
            result[i] = numsCount.get(i)[0];
        }

        return result;
    }
}
```c#
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
```

nums = [2, 7, 11, 15], target = 9

map = {key, value}

loop:

difference: 9 - 2 = 7

if map contains key: 7,
exit loop and return: map {7, 0}

map = {2, 0}

difference: 9 - 7 = 2

if map contains key: 2,
exit loop and return: map {0, 1}

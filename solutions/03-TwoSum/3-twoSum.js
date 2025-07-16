var twoSum = function(nums, target) {

const map = {};

for (let i =0; i<nums.length; i++) {
    let diff = target - nums[i];

    if(map[diff] !== undefined) {
        return [map[diff], i];
    }

    map[nums[i]] = i;
}

 };
 //O(n) Linear growth of operations to input
//hashmaps provide efficient usecases for querying, indexing, finding frequencies, graph algorithms
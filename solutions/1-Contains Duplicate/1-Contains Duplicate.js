/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {

// for (let i = 0; i<nums.length; i++) {
//     for (let j = i+1; j<nums.length; j++) {
//         if (nums[i] === nums[j]) {
//             return true;
//         }
//     }
// }
// return false

let seen = new Set();

for(let num of nums) {
    if (seen.has(num)) {
        return true;
    } seen.add(num);
}
return false
};

/*
What I learned:
-time complexity of O(n²): A linear scan is time ineffective on larger datasets.

-a better solution: O(n) -> Use a Set

    // delcare an empty set
    // for of loop
    // if set 'has' x
    //return true
    //else add it to set

    // return false

*/
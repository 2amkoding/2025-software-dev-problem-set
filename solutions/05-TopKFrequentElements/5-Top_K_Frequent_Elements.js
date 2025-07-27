/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {

let frequencyMap = {}; // frequency each number appears
// create a bucket of Arrays
const bucketOfDuplicates = new Array(nums.length + 1).fill().map(() => []);


for(const n of nums) {
frequencyMap[n] = (frequencyMap[n]|| 0) +1; // if n !exist, 0 + 1, else n+1
}

for(const num in frequencyMap){
    const freq = frequencyMap[num];
    bucketOfDuplicates[freq].push(parseInt(num));
}

const result = [];

for(let i = bucketOfDuplicates.length - 1; i >0; i--) {
    for (const num of bucketOfDuplicates[i]) {
        result.push(num);
        if (result.length === k)
        return result;
    }
}




};
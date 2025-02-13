//Wtf is:
//frequency map
//bucket sort approach
//alternate approach: Heap (priority que)

//freqmap
let  freq= {}

//create buckets
const bucketOfFreqs = new Array(nums.length + 1).fill().map(() => []);

for(const n of nums) {
count[n] = (count[n]|| 0) +1; // "Shorthand"
}
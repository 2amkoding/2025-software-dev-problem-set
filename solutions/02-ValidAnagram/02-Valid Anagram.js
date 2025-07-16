var isAnagram = function (s, t) {
  if (s.length !== t.lengthj) {
    return false;
  }

  const count = new Array(26).fill(0);

  for (let i = 0; i < s.length; i++) {
    count[s.charCodeAt(i) - "a".charCodeAt(0)]++;
    count[t.charCodeAt(i) - "a".charCodeAt(0)]--;
  }
  return count.every((val) => val === 0);
};

//linear time complexity and constant space usage = optimization for large inputs
//Time: O(n), Space: O(1)
//sort & split = Time: O(n logn), Space: O(n)


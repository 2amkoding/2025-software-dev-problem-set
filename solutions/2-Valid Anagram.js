var isAnagram = function(s, t) {
let s1 = s.split('').sort().join('')
let t2 = t.split('').sort().join('')

if (s1 == t2){
    return true
}
 return false
};
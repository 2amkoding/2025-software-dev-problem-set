```plaintext
## 167. TWo SumII - Input Arry is Sorted
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
find two numbers such that they add up to a specific target number. 

Let these two numbers be numbers[index1] and numbers[index2] 
where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, 
added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. 
You may not use the same element twice.

Your solution must use only constant extra space.

##
array index starts at 1, not 0.
array is in ascending order.

## methhod
target = 9

      l         r
array[1,2,3,4,5,9]
      ^         ^
if l+r > 9 -> r--
if l+r < 9 -> l++





```
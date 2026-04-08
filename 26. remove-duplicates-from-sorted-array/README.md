## Remove Duplicates from Sorted Array

  ## Problem Statement

Given a sorted array, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements k.

First k elements → unique values
Remaining elements → can be ignored
## Approach (Simple Idea)

Since the array is already sorted, duplicate elements will be next to each other.

👉 So we use two pointers:

i → keeps track of unique elements position
j → scans the array

## Algorithm Steps

Start i = 0 (first element is always unique)
Traverse array using j from 1 to end
If nums[j] != nums[i]:
Move i forward
Copy nums[j] to nums[i]
Return i + 1 (count of unique elements)

## Pseudocode
function removeDuplicates(nums):

    if length of nums == 0:
        return 0

    i = 0

    for j from 1 to length of nums - 1:
        
        if nums[j] is not equal to nums[i]:
            
            increment i by 1
            set nums[i] = nums[j]

    return i + 1

## Example
Input:
nums = [1,1,2]
Output:
k = 2
nums = [1,2,_]
Input:
nums = [0,0,1,1,1,2,2,3,3,4]
Output:
k = 5
nums = [0,1,2,3,4,_,_,_,_,_]

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1) (in-place)

## Key Points to Remember
- Array is already sorted → important!
- Use two-pointer technique
- Modify array in-place (no extra space)

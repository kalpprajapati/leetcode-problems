## Rotate Array (LeetCode 189)
## Problem Statement

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

## Approach

We use an extra array (temp array) to store rotated elements.

🔹 Idea:
Each element moves to a new index:
newIndex = (i + k) % n
This ensures circular rotation.

## Algorithm Steps
- Find the length of the array n
- Update k using:
- k = k % n
- Create a temporary array temp of size n
- Traverse the original array:
- Place each element at its new position in temp
- Copy all elements from temp back to nums

## Code Implementation (Java)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n; // handle large k
        
        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++){
            temp[(i + k) % n] = nums[i];
        }
        
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}
## Example
Input:
nums = [1,2,3,4,5,6,7]
k = 3
Output:
[5,6,7,1,2,3,4]

## Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(n)

## Key Points
Always use k = k % n to handle large rotations
This approach is simple and easy to understand
Uses extra space (not in-place)

## Alternative Approach
Reverse method (in-place, O(1) space)
Steps:
Reverse entire array
Reverse first k elements
Reverse remaining elements
📚 Conclusion

This method is beginner-friendly and ensures correct rotation using simple indexing logic.

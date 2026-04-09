# Move Zeroes (LeetCode)

##  Problem Statement
Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

You must do this **in-place** without making a copy of the array.

---

##  Example

**Input:**

nums = [0, 1, 0, 3, 12]


**Output:**

[1, 3, 12, 0, 0]

---

## Approach (Two Pointer Technique)

- First, find the position of the **first zero** in the array.
- Use another pointer to scan the rest of the array.
- Whenever a non-zero element is found:
  - Swap it with the zero.
  - Move the zero pointer (`j`) forward.

---

##  Key Idea

- `j` keeps track of where the next non-zero element should go.
- After swapping, always do `j++` to move forward.

---
## Pseudocode: Move Zeroes
START

Set j = -1

// Step 1: Find first zero
FOR i = 0 to length of array - 1
    IF nums[i] == 0 THEN
        j = i
        BREAK
    ENDIF
ENDFOR

// Step 2: If no zero found, exit
IF j == -1 THEN
    RETURN
ENDIF

// Step 3: Move non-zero elements forward
FOR i = j + 1 to length of array - 1
    IF nums[i] != 0 THEN
        SWAP nums[i] and nums[j]
        j = j + 1
    ENDIF
ENDFOR

END
---
## Simple understanding
j → position of zero
i → scans array
When non-zero found → swap and move j forward

Time and Space Complexity
Time Complexity: O(n)
Space Complexity: O(1) (in-place)

## Learning
Two-pointer technique is very useful for array problems.
Always update pointers correctly after swapping.
Helps maintain order without extra space.

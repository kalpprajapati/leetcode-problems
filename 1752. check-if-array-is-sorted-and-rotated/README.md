# 1752. Check if Array Is Sorted and Rotated

## 🧩 Problem
Given an array `nums`, check if it was originally sorted in non-decreasing order and then rotated.

An array is valid if it has at most one position where the order breaks.

---

## 💡 Approach (Simple Explanation)

- A sorted array has no decreasing points.
- A rotated sorted array has **only one decreasing point**.
- Count how many times `nums[i] < nums[i-1]`.
- Also check circular condition (last with first).
- If count ≤ 1 → return true  
- Else → return false  

---

## 🪜 Pseudocode
n = length of nums
count = 0
for i from 1 to n-1:
if nums[i] < nums[i-1]:
count++
if nums[0] < nums[n-1]:
count++
if count <= 1:
return true
else:
return false


---

## 🧪 Example

Input: [3,4,5,1,2]  
Output: true  

Input: [2,1,3,4]  
Output: false  

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🔑 Key Concept
Rotation creates only **one break point** in a sorted array.

---

## 🏷 Tags
#array #rotation #logic

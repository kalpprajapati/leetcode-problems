# Second Largest and Second Smallest Element

## 🧩 Problem
Given an array of integers, find the **second smallest** and **second largest** elements.

If such elements do not exist (array size < 2), return -1.

---

## 💡 Approach (Simple Explanation)

### 🔹 Second Smallest:
- Initialize two variables:
  - `small` → smallest element
  - `second_small` → second smallest
- Traverse the array:
  - If current element < small → update both
  - Else if it is smaller than second_small and not equal to small → update second_small

---

### 🔹 Second Largest:
- Initialize:
  - `large` → largest element
  - `second_large` → second largest
- Traverse the array:
  - If current element > large → update both
  - Else if it is greater than second_large and not equal to large → update second_large

---

## 🪜 Pseudocode

### Second Smallest
if n < 2 → return -1
small = ∞, second_small = ∞
for each element:
if element < small:
second_small = small
small = element
else if element < second_small AND element != small:
second_small = element
return second_small

---

### Second Largest
if n < 2 → return -1
large = -∞, second_large = -∞
for each element:
if element > large:
second_large = large
large = element
else if element > second_large AND element != large:
second_large = element
return second_large


---

## 🧪 Example

Input: [1, 2, 4, 7, 7, 5]  

Second smallest: 2  
Second largest: 5  

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🔑 Key Concepts
- Single pass solution (efficient)
- Handling duplicates
- Tracking two values at a time

---

## ⚠️ Edge Cases
- Array size < 2 → return -1
- All elements same → no second smallest/largest

---

## 🏷 Tags
#array #logic #easy

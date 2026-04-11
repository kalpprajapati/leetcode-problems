# Missing Number (LeetCode 268)

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number that is missing from the array.

---

## Approaches Overview

There are **two main ways** to solve this problem:

1. **Sum Formula Method**
2. **XOR Method**

   * Basic XOR (2 loops)
   * Optimized XOR (single loop) 

---

## Approach 1: Sum Formula

### Idea

* Find the expected sum of numbers from `0` to `n`
* Subtract the sum of array elements
* The result is the missing number

### Formula

```
Total Sum = n * (n + 1) / 2
```

### ⏱ Time Complexity

* O(n)

### Space Complexity

* O(1)

### Code

```java
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }
}
```

---

## Approach 2: XOR (Basic)

### Idea

* XOR all elements of array
* XOR all numbers from `0` to `n`
* XOR both results to get missing number

### Note

* Uses **two loops**
* Time complexity = **O(2n) ≈ O(n)**

---

## Approach 3: Optimized XOR (Best)

### Idea

* Combine both XOR operations into a **single loop**
* Use XOR properties:

  * `a ^ a = 0`
  * `a ^ 0 = a`

### ⏱ Time Complexity

* O(n) 

### Space Complexity

* O(1)

### Code

```java
class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor2 ^= nums[i];     // XOR of array elements
            xor1 ^= (i + 1);     // XOR from 1 to n
        }

        return xor1 ^ xor2;
    }
}
```

---

## Example

```
Input: nums = [3, 0, 1]
Output: 2
```

### Explanation

* Numbers should be: `[0,1,2,3]`
* Missing number is **2**

---

## Key Concepts

### 🔹 XOR Properties

* `a ^ a = 0`
* `a ^ 0 = a`
* XOR cancels duplicate values

### 🔹 Sum Formula

* Sum of first `n` natural numbers:

```
n(n + 1) / 2
```

---

## Comparison

| Approach        | Time Complexity | Space | Notes             |
| --------------- | --------------- | ----- | ----------------- |
| Sum Formula     | O(n)            | O(1)  | Simple & readable |
| XOR (Basic)     | O(n)            | O(1)  | Two loops         |
| XOR (Optimized) | O(n)            | O(1)  | Best approach     |

---

##  Conclusion

* All approaches work in **O(n)** time
* **Optimized XOR** is best for performance and interviews
* **Sum method** is easiest to understand and remember

👉 Recommended: **Optimized XOR Approach**





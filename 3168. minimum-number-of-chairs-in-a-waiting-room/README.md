# 🪑 Minimum Number of Chairs in a Waiting Room

## 📌 Problem Statement

You are given a string `s` representing events:

- `'E'` → A person enters and takes a chair  
- `'L'` → A person leaves and frees a chair  

The room starts empty.

👉 Find the **minimum number of chairs required** so that no one has to wait.

---

##  Intuition

- Track how many people are inside the room at any moment  
- The **maximum number of people present at the same time** is the answer  

---

##  Approach

1. Initialize:
   - `current_people = 0`
   - `max_chairs = 0`

2. Traverse the string:
   - If `'E'`:
     - Increase `current_people`
     - Update `max_chairs = max(max_chairs, current_people)`
   - If `'L'`:
     - Decrease `current_people`

3. Return `max_chairs`

---

## 🧾 Pseudocode
START

SET current_people = 0
SET max_chairs = 0

FOR each character ch in string s:
IF ch == 'E':
current_people = current_people + 1
max_chairs = MAX(max_chairs, current_people)
ELSE:
current_people = current_people - 1

RETURN max_chairs

END
---

## 📊 Example

### Input:

s = "ELELEEL"


### Steps:

E → current = 1
L → current = 0
E → current = 1
L → current = 0
E → current = 1
E → current = 2 ← maximum
L → current = 1


 **Output: 2**

---

## ⏱ Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  

---

##  Key Takeaway

👉 The problem reduces to finding the **maximum number of people present at the same time**.

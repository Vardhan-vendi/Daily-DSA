1.   n & (n-1)  ----> make the RSB to '0'
                ----> n-1   ===> RSB --->0
                            ===> right part alter bits
                            ===> left part same

2.  n & -n      ---> get RSB only
                --->  -n    ===> RSB --->1
                            ===> right part same i.e; 0
                            ===> left part alter bits

3. for any odd numbers ,LSB is always '1'
        (n & 1) == 0 -->even
                != 0 --> odd

4. for any power of 2 ,it only holds only 1 bit , in its  entire bit pattern .
        powOf2 ===> n>0 AND( n & (n-1)) ==0 i.e; making RSB to '0' 

5. to git the right most set bit , we need to get the position ,i.e; the power value of the 2 
        to get that power , use 'log base 2' i.e;
                        n = log 2 with base 2



////////chatGPT questions and Key points/////////////////////////
# Java DSA – Bit Manipulation Problems

A structured collection of Bit Manipulation problems in Java, organized from Beginner to Advanced.

**Goal:** Master bitwise operators, binary manipulation, XOR patterns, and bitmasking techniques for DSA and coding interviews.

## 📚 Learning Roadmap

| Level | Difficulty | Problems |
|---|---|---:|
| Level 1 | Beginner | 10 |
| Level 2 | Intermediate | 8 |
| Level 3 | Advanced | 7 |
| Level 4 | Interview Challenges | 5 |
| **Total** | | **30** |

---

## 🟢 Level 1 – Beginner (Fundamentals)

**Focus:** Binary conversion, AND, OR, XOR, NOT, Left Shift, Right Shift.

- [ 1 ] 1. Check whether a number is Even or Odd 
  - Concept: Bitwise AND (`&`)

- [ 1 ] 2. Check whether a number is a Power of 2
  - Concept: `n & (n - 1)`

- [ 1 ] 3. Count the Number of Set Bits (1s)
  - Concept: Brian Kernighan's Algorithm

- [ 1 ] 4. Find the Rightmost Set Bit (RSB)
  - Concept: `n & -n`

- [ 1 ] 5. Remove the Rightmost Set Bit
  - Concept: `n & (n - 1)`

- [ 1 ] 6. Set the Kth Bit
  - Concept: `n | (1 << k)`

- [ 1 ] 7. Clear the Kth Bit
  - Concept: `n & ~(1 << k)`

- [ 1 ] 8. Toggle the Kth Bit
  - Concept: `n ^ (1 << k)`

- [ 1 ] 9. Check Whether the Kth Bit is Set
  - Concept: `n & (1 << k)`

- [ 1 ] 10. Find the Position of the Rightmost Set Bit
  - Concept: Bit manipulation and bit positions

---

## 🔵 Level 2 – Intermediate (XOR & Number Manipulation)

**Focus:** XOR properties, binary arithmetic, and number manipulation.

- [ 1 ] 11. Find the Unique Element in an Array
  - Concept: XOR

- [ 2 ] 12. Find the Missing Number from 0 to N
  - Concept: XOR

- [ 3 ] 13. Find Two Non-Repeating Elements
  - Concept: XOR partitioning

- [ ] 14. Swap Two Numbers Using XOR
  - Concept: XOR properties

- [ ] 15. Check Whether Two Numbers Have Opposite Signs
  - Concept: XOR / Sign bit

- [ ] 16. Find the Complement of a Number
  - Concept: NOT and Bit Masking

- [ ] 17. Reverse the Bits of an Integer
  - Concept: Bit Shifting

- [ ] 18. Count Differing Bits Between Two Numbers
  - Concept: XOR and Set Bit Counting

---

## 🟠 Level 3 – Advanced (Bit Manipulation Patterns)

**Focus:** Advanced XOR patterns, bit counting, and bitmasking.

- [ ] 19. Find the Single Number When Others Appear Twice
  - Concept: XOR

- [ ] 20. Find the Single Number When Others Appear Three Times
  - Concept: Bit Counting

- [ ] 21. Find Two Numbers Appearing Once When Others Appear Twice
  - Concept: XOR Partitioning

- [ ] 22. Generate All Subsets of an Array
  - Concept: Bitmasking

- [ ] 23. Find the XOR of Numbers from 1 to N
  - Concept: XOR Pattern

- [ ] 24. Calculate XOR of a Range [L, R]
  - Concept: Prefix XOR

- [ ] 25. Find the Total Number of Bits Needed to Convert A to B
  - Concept: XOR and Set Bit Counting

---

## 🔴 Level 4 – Interview Challenges

**Focus:** Advanced problem-solving, optimization, Trie, and Bit DP.

- [ ] 26. Find Maximum XOR of Two Numbers in an Array
  - Concept: Trie + XOR

- [ ] 27. Find the Sum of All Subset XOR Totals
  - Concept: Bit Manipulation

- [ ] 28. Find Minimum Bit Flips to Convert One Number into Another
  - Concept: XOR

- [ ] 29. Find the Largest Power of 2 Less Than or Equal to N
  - Concept: Bit Operations

- [ ] 30. Count Numbers with Exactly K Set Bits in a Range
  - Concept: Combinatorics + Bit DP

---

## 💡 Important Bit Manipulation Formulas

| Operation | Expression |
|---|---|
| Check odd | `n & 1` |
| Check even | `(n & 1) == 0` |
| Check power of 2 | `n > 0 && (n & (n - 1)) == 0` |
| Remove rightmost set bit | `n & (n - 1)` |
| Isolate rightmost set bit | `n & -n` |
| Set Kth bit | `n | (1 << k)` |
| Clear Kth bit | `n & ~(1 << k)` |
| Toggle Kth bit | `n ^ (1 << k)` |
| Check Kth bit | `(n & (1 << k)) != 0` |
| Count set bits | `Integer.bitCount(n)` |

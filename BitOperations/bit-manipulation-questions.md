# LeetCode Bit Manipulation: Step-by-Step Mastery List

**Note on "all questions":** LeetCode's Bit Manipulation tag holds 500+ problems, and many are just tagged for a minor trick. Below is a curated, ordered list of about 120 problems that covers every bit-manipulation technique, from basic to hard. Problem numbers are from LeetCode; cross-check any title against the tag page (leetcode.com/tag/bit-manipulation) as numbering is stable but difficulty labels occasionally change.

**How to use:** Finish each step before moving on. Do problems in order. Re-solve anything you needed a hint for after 2 days.

Legend: E = Easy, M = Medium, H = Hard

---

## Step 0: Learn the toolkit (no problems, 1 hour)

| Trick | Code |
|---|---|
| Check i-th bit | `(n >> i) & 1` |
| Set i-th bit | `n \| (1 << i)` |
| Clear i-th bit | `n & ~(1 << i)` |
| Toggle i-th bit | `n ^ (1 << i)` |
| Clear lowest set bit | `n & (n - 1)` |
| Isolate lowest set bit | `n & -n` |
| Power of two check | `n > 0 && (n & (n - 1)) == 0` |
| Count set bits | `Integer.bitCount(n)` or loop with `n &= n - 1` |
| Swap without temp | `a ^= b; b ^= a; a ^= b;` |
| All ones mask of k bits | `(1 << k) - 1` |
| Iterate all subsets of n items | `for (int mask = 0; mask < (1 << n); mask++)` |
| Iterate submasks of m | `for (s = m; s > 0; s = (s - 1) & m)` |
| Java specifics | `>>` is signed, `>>>` is unsigned; `int` is 32 bits; use `1L << i` for long masks |

XOR facts: `a ^ a = 0`, `a ^ 0 = a`, XOR is commutative and associative.

---

## Step 1: Counting and checking bits (Easy warm-up)
- [1] 191. Number of 1 Bits (E)
- [1] 231. Power of Two (E)
- [1] 342. Power of Four (E)
- [1] 338. Counting Bits (E)
- [1] 461. Hamming Distance (E)
- [1] 476. Number Complement (E)
- [1] 1009. Complement of Base 10 Integer (E)
- [1] 693. Binary Number with Alternating Bits (E)
- [ ] 868. Binary Gap (E)
- [ ] 762. Prime Number of Set Bits in Binary Representation (E)
- [ ] 1356. Sort Integers by The Number of 1 Bits (E)
- [ ] 2595. Number of Even and Odd Bits (E)
- [ ] 2859. Sum of Values at Indices With K Set Bits (E)
- [ ] 2220. Minimum Bit Flips to Convert Number (E)
- [ ] 3226. Number of Bit Changes to Make Two Integers Equal (E)
- [ ] 3370. Smallest Number With All Set Bits (E)

## Step 2: XOR properties
- [ ] 136. Single Number (E)
- [ ] 268. Missing Number (E)
- [ ] 389. Find the Difference (E)
- [ ] 1486. XOR Operation in an Array (E)
- [ ] 1720. Decode XORed Array (E)
- [ ] 2433. Find The Original Array of Prefix Xor (M)
- [ ] 2683. Neighboring Bitwise XOR (M)
- [ ] 3158. Find the XOR of Numbers Which Appear Twice (E)
- [ ] 2425. Bitwise XOR of All Pairings (M)
- [ ] 2527. Find Xor-Beauty of Array (M)
- [ ] 2997. Minimum Number of Operations to Make Array XOR Equal to K (M)
- [ ] 2917. Find the K-or of an Array (E)
- [ ] 1318. Minimum Flips to Make a OR b Equal to c (M)

## Step 3: Shifts, masks and conversions
- [ ] 190. Reverse Bits (E)
- [ ] 405. Convert a Number to Hexadecimal (E)
- [ ] 67. Add Binary (E)
- [ ] 1290. Convert Binary Number in a Linked List to Integer (E)
- [ ] 1022. Sum of Root To Leaf Binary Numbers (E)
- [ ] 717. 1-bit and 2-bit Characters (E)
- [ ] 401. Binary Watch (E)
- [ ] 371. Sum of Two Integers (M)
- [ ] 1404. Number of Steps to Reduce a Number in Binary Representation to One (M)

## Step 4: Core medium tricks (AND, OR, XOR patterns)
- [ ] 169. Majority Element (E, try the bitwise-count method)
- [ ] 137. Single Number II (M)
- [ ] 260. Single Number III (M)
- [ ] 201. Bitwise AND of Numbers Range (M)
- [ ] 477. Total Hamming Distance (M)
- [ ] 89. Gray Code (M)
- [ ] 29. Divide Two Integers (M)
- [ ] 1863. Sum of All Subset XOR Totals (E)
- [ ] 1310. XOR Queries of a Subarray (M)
- [ ] 1442. Count Triplets That Can Form Two Arrays of Equal XOR (M)
- [ ] 1738. Find Kth Largest XOR Coordinate Value (M)
- [ ] 1829. Maximum XOR for Each Query (M)
- [ ] 2419. Longest Subarray With Maximum Bitwise AND (M)
- [ ] 2401. Longest Nice Subarray (M)
- [ ] 2275. Largest Combination With Bitwise AND Greater Than Zero (M)
- [ ] 2044. Count Number of Maximum Bitwise-OR Subsets (M)
- [ ] 2317. Maximum XOR After Operations (M)
- [ ] 2680. Maximum OR (M)
- [ ] 1969. Minimum Non-Zero Product of the Array Elements (M)
- [ ] 2571. Minimum Operations to Reduce an Integer to 0 (M)
- [ ] 2438. Range Product Queries of Powers (M)
- [ ] 1545. Find Kth Bit in Nth Binary String (M)
- [ ] 3125. Maximum Number That Makes Result of Bitwise AND Zero (M)
- [ ] 3011. Find if Array Can Be Sorted (M)
- [ ] 3133. Minimum Array End (M)

## Step 5: Bitmask enumeration and state compression
- [ ] 78. Subsets (M)
- [ ] 90. Subsets II (M)
- [ ] 784. Letter Case Permutation (M)
- [ ] 318. Maximum Product of Word Lengths (M)
- [ ] 1239. Maximum Length of a Concatenated String with Unique Characters (M)
- [ ] 1371. Find the Longest Substring Containing Vowels in Even Counts (M)
- [ ] 1177. Can Make Palindrome from Substring (M)
- [ ] 1915. Number of Wonderful Substrings (M)
- [ ] 1457. Pseudo-Palindromic Paths in a Binary Tree (M)
- [ ] 2002. Maximum Product of the Length of Two Palindromic Subsequences (M)
- [ ] 2397. Maximum Rows Covered by Columns (M)

## Step 6: Bit tries, prefix-OR and sliding bit windows
- [ ] 187. Repeated DNA Sequences (M)
- [ ] 421. Maximum XOR of Two Numbers in an Array (M)
- [ ] 898. Bitwise ORs of Subarrays (M)
- [ ] 2411. Smallest Subarrays With Maximum Bitwise OR (M)
- [ ] 3095. Shortest Subarray With OR at Least K I (E)
- [ ] 3097. Shortest Subarray With OR at Least K II (M)
- [ ] 2932. Maximum Strong Pair XOR I (E)
- [ ] 2935. Maximum Strong Pair XOR II (H)
- [ ] 1707. Maximum XOR With an Element From Array (H)
- [ ] 1803. Count Pairs With XOR in a Range (H)
- [ ] 1938. Maximum Genetic Difference Query (H)
- [ ] 3171. Find Subarray With Bitwise OR Closest to K (H)
- [ ] 3022. Minimize OR of Remaining Elements Using Operations (H)

## Step 7: Bitmask DP
- [ ] 464. Can I Win (M)
- [ ] 526. Beautiful Arrangement (M)
- [ ] 473. Matchsticks to Square (M)
- [ ] 698. Partition to K Equal Sum Subsets (M)
- [ ] 2305. Fair Distribution of Cookies (M)
- [ ] 2741. Special Permutations (M)
- [ ] 1986. Minimum Number of Work Sessions to Finish the Tasks (M)
- [ ] 1723. Find Minimum Time to Finish All Jobs (H)
- [ ] 1655. Distribute Repeating Integers (H)
- [ ] 847. Shortest Path Visiting All Nodes (H)
- [ ] 943. Find the Shortest Superstring (H)
- [ ] 1125. Smallest Sufficient Team (H)
- [ ] 1434. Number of Ways to Wear Different Hats to Each Other (H)
- [ ] 691. Stickers to Spell Word (H)
- [ ] 1879. Minimum XOR Sum of Two Arrays (H)
- [ ] 1994. The Number of Good Subsets (H)
- [ ] 1494. Parallel Courses II (H)
- [ ] 2172. Maximum AND Sum of Array (H)
- [ ] 1178. Number of Valid Words for Each Puzzle (H)

## Step 8: Mastery and hard puzzles
- [ ] 1611. Minimum One Bit Operations to Make Integers Zero (H)
- [ ] 982. Triples with Bitwise AND Equal To Zero (H)
- [ ] 995. Minimum Number of K Consecutive Bit Flips (H)
- [ ] 1835. Find XOR Sum of All Pairs Bitwise AND (H)
- [ ] 1734. Decode XORed Permutation (M)
- [ ] 1017. Convert to Base -2 (M)
- [ ] 1073. Adding Two Negabinary Numbers (M)

---

## Bonus practice (classic problems beyond the list)
These are common on GeeksforGeeks, InterviewBit, Codeforces-style sets and interviews. Search them by name.

- [ ] Find the two non-repeating elements in an array where all others appear twice
- [ ] Swap two numbers without a temporary variable (and the pitfall when both are the same variable)
- [ ] Check whether the k-th bit is set, then set/clear/toggle it
- [ ] Find the position of the only set bit
- [ ] Find the rightmost different bit of two numbers
- [ ] Count total set bits in all numbers from 1 to n
- [ ] Count the number of bits to flip to convert A to B (generalize to arrays)
- [ ] Find the element that appears once when others appear k times
- [ ] Maximum XOR subarray
- [ ] Maximum AND of any pair in an array
- [ ] Convert Gray code to binary and back
- [ ] Next higher number with the same number of set bits
- [ ] Reverse the bits of a 64-bit number and rotate bits left/right
- [ ] Check whether a number is a power of 8 or 16
- [ ] Find the XOR of all numbers from 1 to n in O(1)
- [ ] Count pairs in an array whose XOR is a power of two
- [ ] Longest subarray with equal 0s and 1s (prefix trick)
- [ ] Bitwise AND of a range [L, R] using the common prefix
- [ ] Sum over subsets (SOS DP) basics and subset-sum with bitsets
- [ ] Design a bitset or bit vector class with `set`, `get`, `flip`, `count`

---

## Suggested schedule (about 3 weeks, 2 to 4 problems a day)
- **Days 1 to 2:** Step 0 and Step 1
- **Days 3 to 5:** Step 2 and Step 3
- **Days 6 to 10:** Step 4
- **Days 11 to 13:** Step 5
- **Days 14 to 16:** Step 6
- **Days 17 to 20:** Step 7
- **Day 21:** Step 8 plus bonus problems

If you are short on time, do only the problems marked E or M in Steps 1 to 5 (about 70 problems) and treat Steps 6 to 8 as stretch.

## Patterns to recognize
| Signal in the problem | Technique |
|---|---|
| "Appears once, others twice" | XOR everything |
| "Appears once, others three times" | Count each bit mod 3 |
| Range AND/OR | Common prefix, or bit-by-bit counts |
| Subsets with n up to about 20 | Bitmask enumeration |
| Visiting all nodes/items, n up to about 20 | Bitmask DP |
| Max/min XOR of pairs | Binary trie, or build the answer bit by bit |
| Subarray AND/OR queries | Keep a small set of distinct values; they change at most about 30 times |
| Parity of character counts | Bitmask of 26 bits plus prefix map |
| Flips with a window | Sliding window with a difference array |
| Divide or multiply without operators | Shift and subtract/add |

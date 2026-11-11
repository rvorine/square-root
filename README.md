[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Square Root (LeetCode 69)

## Problem

Given a non-negative integer `x`, return the square root of `x` **rounded down** to the nearest integer. Do not use a built-in exponent function or operator such as `pow(x, 0.5)` or `x ** 0.5`.

Example:

```
Input:  4              Output: 2
Input:  8              Output: 2      // sqrt(8) = 2.828..., rounded down
Input:  0              Output: 0
Input:  2147483647     Output: 46340
```

## Solution

**Binary search on the answer.**

The answer is the largest integer `m` with `m * m <= x`. That condition is true for small `m` and false for large `m`, so it is monotonic and can be binary searched over `[1, x]`.

- Take `mid`. If `mid * mid <= x`, `mid` is a valid answer: store it and search higher (`lo = mid + 1`).
- Otherwise `mid` is too big: search lower (`hi = mid - 1`).
- When the range is empty, the last stored value is the floor of the square root.

The check is written as `mid <= x / mid` instead of `mid * mid <= x`. That avoids integer overflow for large `x` (and floating-point precision loss in JavaScript).

Trying every number from 1 upward is O(√x); halving the range each step is much faster.

**Time:** O(log x) — the range halves every step.
**Space:** O(1).

## Implementations

| Language | File |
|---|---|
| Python | [`python/my_sqrt.py`](python/my_sqrt.py) |
| Java | [`java/MySqrt.java`](java/MySqrt.java) |
| Kotlin | [`kotlin/MySqrt.kt`](kotlin/MySqrt.kt) |
| JavaScript | [`javascript/mySqrt.js`](javascript/mySqrt.js) |
| C# | [`csharp/MySqrt.cs`](csharp/MySqrt.cs) |

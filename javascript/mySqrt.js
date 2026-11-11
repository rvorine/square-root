function mySqrt(x) {
  let lo = 1, hi = x;
  let answer = 0;

  while (lo <= hi) {
    const mid = lo + Math.floor((hi - lo) / 2);
    if (mid <= Math.floor(x / mid)) { // mid * mid <= x, without precision loss
      answer = mid;                   // mid works, try something bigger
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return answer;
}

console.log(mySqrt(4));            // 2
console.log(mySqrt(8));            // 2
console.log(mySqrt(0));            // 0
console.log(mySqrt(2147483647));   // 46340

module.exports = { mySqrt };

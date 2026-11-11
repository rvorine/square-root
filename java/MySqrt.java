public class MySqrt {

    static int mySqrt(int x) {
        int lo = 1, hi = x;
        int answer = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid <= x / mid) { // mid * mid <= x, without overflow
                answer = mid;     // mid works, try something bigger
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));            // 2
        System.out.println(mySqrt(8));            // 2
        System.out.println(mySqrt(0));            // 0
        System.out.println(mySqrt(2147483647));   // 46340
    }
}

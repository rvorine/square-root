using System;

class MySqrt
{
    static int Solve(int x)
    {
        int lo = 1, hi = x;
        int answer = 0;

        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (mid <= x / mid) // mid * mid <= x, without overflow
            {
                answer = mid;   // mid works, try something bigger
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }
        return answer;
    }

    static void Main()
    {
        Console.WriteLine(Solve(4));            // 2
        Console.WriteLine(Solve(8));            // 2
        Console.WriteLine(Solve(0));            // 0
        Console.WriteLine(Solve(2147483647));   // 46340
    }
}

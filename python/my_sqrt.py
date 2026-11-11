def my_sqrt(x):
    lo, hi = 1, x
    answer = 0

    while lo <= hi:
        mid = lo + (hi - lo) // 2
        if mid <= x // mid:  # mid * mid <= x, without overflow
            answer = mid     # mid works, try something bigger
            lo = mid + 1
        else:
            hi = mid - 1

    return answer


if __name__ == "__main__":
    print(my_sqrt(4))            # 2
    print(my_sqrt(8))            # 2
    print(my_sqrt(0))            # 0
    print(my_sqrt(2147483647))   # 46340

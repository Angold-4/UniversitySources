from sys import stdin

f = {}
def fib(n):
    global f
    if n in f: # if F(n) was computed before
        return f[n]

    # if F(n) was not computed before
    if n <= 1:
        f[n] = n
    else:
        f[n] = fib(n-1) + fib(n-2)
    return f[n]

def main():
    """Reads a user-specified non-negative integer n,
    and then prints the n-th Fibonacci number F(n)."""

    n = int(stdin.readline())
    print(f"F({n}) = {fib(n)}")

if __name__ == "__main__":
    print(main.__doc__)
    main()

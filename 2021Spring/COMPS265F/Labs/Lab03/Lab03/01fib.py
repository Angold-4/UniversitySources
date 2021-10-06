from sys import stdin

def fib(n):
    if n <= 1:
        return n
    else:
        return fib(n-1) + fib(n-2)

def main():
    """Reads a user-specified non-negative integer n,
    and then prints the n-th Fibonacci number F(n)."""

    n = int(stdin.readline())
    print(f"F({n}) = {fib(n)}")

if __name__ == "__main__":
    print(main.__doc__)
    main()

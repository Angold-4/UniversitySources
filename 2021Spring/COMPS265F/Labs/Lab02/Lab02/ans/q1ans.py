from sys import stdin

def main():
    """Reads a user-specified non-negative integer n,
    and then prints n!."""

    n = int(stdin.readline()) # n is a positive integer
    print(f"When n = {n}, n! = {fac(n)}.")

def fac(k):
    if k == 0:
        return 1
    else:
        return k * fac(k-1)

if __name__ == "__main__":
    print(main.__doc__)
    main()

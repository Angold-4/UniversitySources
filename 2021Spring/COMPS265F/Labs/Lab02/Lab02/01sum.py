from sys import stdin

def main():
    """Reads a user-specified positive integer n,
    and then prints the sum from 1 to n."""

    n = int(stdin.readline()) # n is a positive integer
    print(f"When n = {n}, 1 + 2 + 3 + ... + n = {sum(n)}.")

def sum(k):
    if k == 1:
        return 1
    else:
        return k + sum(k-1)

if __name__ == "__main__":
    print(main.__doc__)
    main()


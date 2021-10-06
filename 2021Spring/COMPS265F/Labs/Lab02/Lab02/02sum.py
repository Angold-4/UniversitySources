from sys import stdin

class Summation:
    # Constructor
    def __init__(self, n):
        self.n = n  # Create an instance variable

    # Instance method 1
    def result(self):
        return self.sum(self.n)

    # Instance method 2
    def sum(self, k):
        if k == 1:
            return 1
        else:
            return k + self.sum(k-1)

def main():
    """Reads a user-specified positive integer n, 
    and then prints the sum from 1 to n."""
    
    n = int(stdin.readline()) 	# n is a positive integer
    s = Summation(n)            # Create a Summation object
    print(f"When n = {n}, 1 + 2 + 3 + ... + n = {s.result()}.")

if __name__ == "__main__":
    print(main.__doc__)
    main()
    
from sys import stdin

def gcd(a, b):
    if a == b:
        return a
    elif a > b:
        return gcd(a-b, b)
    else:
        return gcd(a, b-a)

a = int(stdin.readline()) 	# n is a positive integer
b = int(stdin.readline()) 	# n is a positive integer
print(f"The GCD of {a} and {b} is {gcd(a,b)}.")
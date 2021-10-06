def func(L):
    if len(L) == 1:
        return float('inf')
    if len(L) == 2:
        return L[1] - L[0]
    m = len(L)//2
    return min(func(L[:m]), func(L[m:]), L[m] - L[m-1])

if __name__ == "__main__":
    L = [1, 3, 7, 8, 10, 12];
    print(L[3:])

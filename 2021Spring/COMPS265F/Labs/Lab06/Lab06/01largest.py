import numpy as np
from sort5 import sort5

def largest(N, k):
    if len(N) < 5:
        a = sorted(N)[(len(N)-1)//2]
    else:
        n = len(N) - (len(N) % 5)
        medians = [sort5(N[i:i+5])[2] for i in range(0, n, 5)]
        a = largest(medians, len(medians)//2 + 1)

    L = [x for x in N if x > a]
    S = [x for x in N if x < a]

    len_L = len(L) + 1
    if len_L == k:
        return a
    elif len_L > k:
        return largest(L, k)
    else:
        return largest(S, k-len_L)

if __name__ == "__main__":
    N = np.random.permutation(50).tolist()
    print(largest(N, 10))

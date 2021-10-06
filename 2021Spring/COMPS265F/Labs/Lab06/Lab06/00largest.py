import numpy as np

def largest(N, k):
    a = N[0]

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

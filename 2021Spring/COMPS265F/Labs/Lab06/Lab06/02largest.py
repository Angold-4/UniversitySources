import numpy as np
from sort5 import sort5
from functools import total_ordering

@total_ordering
class Number:
    def __init__(self, number, id):
        self.number = number
        self.id = id

    def __eq__(self, other):
        return self.number == other.number and self.id == other.id

    def __lt__(self, other):
        if self.number != other.number:
            return self.number < other.number
        else:
            return self.id < other.id

    def __str__(self):
        return str(self.number)

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
    N.extend(N)
    N1 = [Number(N[i], i) for i in range(len(N))]
    print(largest(N1, 10))

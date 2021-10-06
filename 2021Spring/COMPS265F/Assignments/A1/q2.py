"""
COMPS265F
Assignment1
q2.py

Name: Jiawei Wang
ID:   s1239587
"""

def func(X, n):
    # original function
    # time complexity: O(n^3)
    Y = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(i, n):
            for k in range(i, j+1):
                Y[i][j] += X[k]
    return Y

def func1(X, n):
    # the answer of Q2(c)
    # time complexity: O(n^2)
    Y = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(i, n):
            if j == 0:
                Y[i][j] = X[0]
            else:
                Y[i][j] = Y[i][j-1] + X[j]
    return Y



if __name__ == "__main__":
    n = 500
    X = list(range(n))
    for i in range(30, 50):
        print(X[i], end=" ")
    print()

    print(func(X, n)[30][49])  # 790
    print()
    print(func1(X, n)[30][49]) # 790

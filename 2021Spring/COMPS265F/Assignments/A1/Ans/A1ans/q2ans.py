def func(X, n):
    Y = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        Y[i][i] = X[i]
        for j in range(i+1, n):
            Y[i][j] += Y[i][j-1] + X[j]
    return Y

if __name__ == "__main__":
    n = 500
    X = list(range(n))
    for i in range(30, 50):
        print(X[i], end=" ")
    print()

    print(func(X, n)[30][49])
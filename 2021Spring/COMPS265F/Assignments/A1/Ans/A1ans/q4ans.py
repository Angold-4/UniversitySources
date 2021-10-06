from sys import stdin

def coin_change(b):
    coins = [10, 5, 2, 1]
    num = []
    for c in coins:
        num.append(b//c) # we need floor(b/c) coins of value c
        b = b % c

    answer = []
    for i in range(len(coins)):
        answer.extend([coins[i] for j in range(num[i])])
    return answer

if __name__ == '__main__':
    b = int(stdin.readline())
    print(coin_change(b))
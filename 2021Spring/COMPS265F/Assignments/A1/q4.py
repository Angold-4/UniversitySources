"""
COMPS265F
Assignment1
q4.py

Name: Jiawei Wang
ID:   s1239587
"""

from sys import stdin

#this function should return the minimal list of coins that equals $b in descending order.
def func(value):
    #your codes go here

    # value of coins
    Vcoin = [10, 5, 2, 1]

    # number of coins
    Ncoin = []

    for c in Vcoin:
        n = value // c
        if n:
            value -= n*c
            for i in range(n):
                Ncoin.append(c)

    return Ncoin


if __name__ == '__main__':
    value = int(stdin.readline())
    coins = func(value)
    print(coins)

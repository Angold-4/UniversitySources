# quantifer.py Jiawei Wang 20201017 00:34


# Existential quantifer:
def example1():
    """
    excist x (x + 1 > 0)
    """
    U = [1, 2, 3, 4, 5, 6]
    result = [x for x in U if x + 1 > 0]
    print("result =", result)
    print('"There exists x such that x + 1 > 0" =',
          len(result) != 0)


# Universal quantifer:
def example2():
    """
    for all x (x - 5 > 0)
    --> the counterexample of excist x (x - 5 <= 0)
    """
    U = [1, 2, 3, 4, 5, 6]
    result = [x for x in U if x - 5 <= 0]
    print("result =", result)
    print('"For all x, x - 5 > 0" =', len(result) == 0)


# Multiple quantifiers:
def mqex1():
    """
    for all x and y (x + y = 3)
    --> the counterexample of excist x and y (x + y != 3)
    """
    U = [-1, 0, 1, 2, 3, 4]
    result = [(x, y) for x in U for y in U if x + y != 3]
    print("result =", result)
    print('"For all x, for all y, x+y = 3" =', len(result) == 0)


def mqex2():
    """
    for all x excist y (x + y = 3)
    --> the counterexample of excist x not excist y (x + y = 3)
    """
    U = [-1, 0, 1, 2, 3, 4]
    X = [x for x in U if len([y for y in U if x+y == 3]) == 0]  # for judgement
    print('"For all x, there exists y s.t. x+y = 3" =',
          len(X) == 0)  # get the negation
    print("result =", [(x, [y for y in U if x+y == 3]) for x in U])


def mqex3():
    """
    for all y excist x (x + y = 3)
    --> the counterexample of excist x and excist y (x + y != 3)
    """
    U = [-1, 0, 1, 2, 3, 4]
    X = [x for x in U if len([y for y in U if x+y != 3]) == 0]  # for judgement
    print('"There exists x s.t. for all y, x+y = 3" =',
          len(X) != 0)  # No need to get the negetion
    print("result =", [(x, [y for y in U if x+y != 3])
                       for x in U])


def mqex4():
    """
    excist x and y (x + y = 3)
    """
    U = [-1, 0, 1, 2, 3, 4]
    result = [(x, y) for x in U for y in U if x + y == 3]
    print("result =", result)
    print('"There exists x and y s.t. x+y = 3" =',
          len(result) != 0)


if __name__ == "__main__":
    example1()
    example2()

    mqex1()
    mqex2()
    mqex3()
    mqex4()

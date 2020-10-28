# Unit1 -- Logic


## 1.Puzzle
**In the middle of the journey to afterlife, you need to select whether to go East or West at a branch.**<br>
**One is the path to hell and the other is to heaven, but you cannot tell which is which.**<br>
**A knowledgeable man called Tom knows the way.<br>Yet you are informed that Tom either <u>always tells the truth</u> or <u>always lies.</u>**<br>

**You are only allowed to ask Tom <u>one</u> question to determine the way to heaven. What to ask?**

#### Aim
**Let P = “East is the way to heaven”, and let Q = “Tom always lies”.**<br>
**We want Tom’s answer to reflect P's truth value.**

#### Solving
**Let's see that:<br>**
```
P * Q (* means a logic oprator)
```
* **Case 1: Tom tells truth (Q = false):<br>Tom will answer ```P * Q = P * false```**
* **Case 2: Tom tells lies (Q = true):<br>Tom will answer ```¬(P * Q) = ¬(P * true)```(Because he lies he will give the opposite answer)**
<br>

**Let's assume that ```P * false == ¬(P * true) = P```<br>**
**That means if we can find out the oprator of `x`, then the Tom's answer (T/F) is the (T/F) of P**
```
Let's see the truth table:
P     Q  |  P*Q  |
T     F  |   T   |
F     F  |   F   |
T     T  |   F   |
F     T  |   T   |
```
**Obviously, the `*` must be exlusive-or.**

#### Answer
**Question for Tom: Is “(East is the way to heaven) (exclusive-or) (You always lie)” true or false?**

## 2. Using pycode to represent

```py
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

```


def sort5(L):
    "Sort a list L of 5 numbers in 7 comparisons"
    a, b, c, d, e = L
    if b < a:   a, b = b, a
    if d < c:   c, d = d, c
    if a < c:   a, b, c, d = c, d, a, b

    if e > a:
        if e > b:   pass
        else:       b, e = e, b
    else:
        if e < c:   c, a, b, e = e, c, a, b
        else:       a, b, e = e, a, b
    
    if d < b:
        if d < a:   return [c, d, a, b, e]
        else:       return [c, a, d, b, e]
    else:
        if d > e:   return [c, a, b, e, d]
        else:       return [c, a, b, d, e]

if __name__ == "__main__":
    from itertools import permutations
    assert all(sort5(p) == sorted(p) for p in permutations(range(5)))

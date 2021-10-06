a = [(1,20), (1,10), (2,10), (2,20)]
print(min(a), max(a))
print(min(a, key = lambda t: t[0]), max(a, key = lambda t: t[0]))
print( a.index(min(a)), a.index(max(a)) )

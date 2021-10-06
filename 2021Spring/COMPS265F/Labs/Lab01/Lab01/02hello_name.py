from sys import stdin

name = stdin.readline()
name = name.replace("\n", "")
print("Hello {}!".format(name))

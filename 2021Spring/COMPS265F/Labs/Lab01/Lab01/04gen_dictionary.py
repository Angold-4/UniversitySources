import sys

def main():
    dictionary = []

    for line in sys.stdin:
        line = line.lower().split()
        for word in line:
            if word not in dictionary:
                dictionary.append(word)

    dictionary.sort()

    for word in dictionary:
        print(word)

main()
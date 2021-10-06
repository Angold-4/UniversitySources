import sys

def main():
    dictionary = {}

    for line in sys.stdin:
        line = line.lower().split()
        for word in line:
            if word not in dictionary:
                dictionary[word] = 1
            else:
                dictionary[word] += 1

    for word in sorted(dictionary):
        print(word, dictionary[word])

main()
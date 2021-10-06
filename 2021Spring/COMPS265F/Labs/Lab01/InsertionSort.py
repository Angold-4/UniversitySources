def InsertionSort(List):
    for i in range(1, len(List)):
        key = List[i]
        i = i - 1
        while(i>=0 and List[i]>key):
            List[i+1] = List[i]
            i = i - 1
        List[i+1] = key
    return List

def main():
    List = [1, 3, 4, 8, 2, 5, 6, 2]
    Alist = InsertionSort(List)
    for a in Alist:
        print(a)


if __name__ == "__main__":
    main()

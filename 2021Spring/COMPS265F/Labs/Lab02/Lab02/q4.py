def max1(num_list):
    for i in num_list:
        isMax = True

        for j in num_list:
            if j > i:
                isMax = False

        if isMax:
            return i

num_list = list(range(10000))
print(max1(num_list))

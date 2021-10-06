def max1(num_list):
    for i in num_list:
        isMax = True
        
        for j in num_list:
            if j > i:
                isMax = False
        
        if isMax:
            return i 

def max2(num_list):
    m = num_list[0]
    for i in num_list:
        if i > m:
            m = i
    return m

num_list = list(range(10000))
print(max2(num_list))
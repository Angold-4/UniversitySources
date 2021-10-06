from sys import stdin

def main():
    sum = cnt = 0
    for num in stdin:
        num = int(num)
        if num > 0:
            cnt += 1
            sum += num
    print(f"The mean is {sum / cnt}.")

main()
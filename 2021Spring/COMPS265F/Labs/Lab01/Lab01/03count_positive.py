from sys import stdin

def main():
	positive = 0
	for num in stdin:
		num = int(num)
		if num > 0:
			positive += 1
	print(f"There are {positive} positive numbers.")

main()
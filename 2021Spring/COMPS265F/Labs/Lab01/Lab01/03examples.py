x = 3
n = 7
s = 2

print("while-loop:")
i = 0						# begin
while i < n:				# condition checking
	print(i)
	i += 1					# step

print("range with 1 argument:")
for i in range(n):
	print(i)				# print from 0 to n-1

print("range with 2 arguments:")
for i in range(x, n):
	print(i)				# print from x to n-1

print("range with 3 arguments:")
for i in range(x, n, s):
	print(i)				# print from x, x+s, x+s+s...

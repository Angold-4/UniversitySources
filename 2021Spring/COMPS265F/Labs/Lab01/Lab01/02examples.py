# Integer:
x = 2
print(x, x + 1, x - 1, x * 3, x ** 3)			# x**3 means x^3
print(7 / 3, 7 // 3, 7 % 3)						# x//y & x%y are quotient & remainder of x/y

# Float:
y = 2.5
print(y, y + 1, y * 2, y ** 2)

# Boolean:
handsome = False
rich = True
print(handsome and rich)
print(handsome or rich)
print(not handsome)

# String:
name = "Keith"
print(name.lower()) 			 				# Convert all characters to lowercase
print(name[0], name[-1])	 	 				# Print the first and the last character
print(name[1:4])				 				# Print substring from index 1 to index 4-1=3
age = 30
print(f"{name} is more than {age}.")  			# Adding f before the string makes a f-string
name += " Lee        "
print(name.strip())  					 		# Remove the leading and trailing whitespaces

# Function type:
print(type(3), type(3.0), type("True"), type(True))

# String concatenation:
number = 3
string = "Three"
#print(number + string)						# Run-time error
print(str(number) + string) 				# Prints "3Three"
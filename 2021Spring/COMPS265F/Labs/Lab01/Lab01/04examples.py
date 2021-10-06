print("# List:")
nums = [x for x in range(10)] 		# generate a list of integer from 0 upto 10 (exclusive)
even = [x for x in nums if x % 2 == 0]
print(even)

# append an item (number 10) to the end of list
even.append(10)
print(even)

# check if an item (num) is in the list; if yes, prints its index
for num in [3, 4, 5, 6]:
    if num in even:
        print(even.index(num), end=" ")     # end with a space instead of \n
    else:
        print("No", end=" ")
print()

# remove an item (number 4) from the list
even.remove(4)
print(even)

# remove the item at index 2
del even[2]
print(even)

# insert the number 3 at index 2
even.insert(2, 3)
print(even)

# print the first three elements of even
print(even[:3])

# extend a list using another list
prime = even[1:3]
prime.extend([5, 7])
print(prime)

# print the list in reverse order
print(prime[::-1])      # list slicing operator [start:stop:step]

print("\n# Tuple:")
t = (12345, 54321, 'hello!')
print(t)			# Prints (12345, 54321, 'hello!')
print(t[1])			# Prints 54321
for item in t:
	print(item)
a, b, c = t
print(a, b, c)		# Prints 12345 54321 hello!''

print("\n# Set:")
my_set = {1,3,5,1}
print(my_set)			# Prints {1, 3, 5}
print(2 in my_set)		# Prints False
print(3 in my_set)		# Prints True
my_set.add(2)
print(my_set)			# Prints {1, 2, 3, 5}
my_set.remove(1)
print(my_set)			# Prints {2, 3, 5}
for item in my_set:
	print(item)


print("\n# Dictionary:")
phonebook = {'Keith': '27686024', 'Vanessa': '27686814'}

# Andrew is not in the phone book
if 'Andrew' in phonebook:
	print("Andrew's number is", phonebook['Andrew'])
else:
	print("Andrew's number is not in the phone book.")

# We add Andrew's contact to the phone book
print("Let's add Andrew's phone")
phonebook['Andrew'] = '27686846'

# Now we should be able to get Andrew's phone
if 'Andrew' in phonebook:
	print("Andrew's number is", phonebook['Andrew'])
else:
	print("Andrew's number is not in the phone book.")

# change Keith's number
print("Keith's original number is", phonebook['Keith'])
phonebook['Keith'] = '21800000'
print("Keith's new number is", phonebook['Keith'])

del phonebook['Keith']
if 'Keith' in phonebook:
	print("Keith's number is", phonebook['Keith'])
else:
	print("Keith's number is not in the phone book.")

names = phonebook.keys()
print(names)
for name in names:
	print(name, phonebook[name])
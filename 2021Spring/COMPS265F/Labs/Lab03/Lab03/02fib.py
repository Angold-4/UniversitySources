from sys import stdin

num_node = 0

class Node:
    def __init__(self, n, left, right):
        global num_node
        self.id = str(num_node)
        num_node += 1
        self.n = n
        self.left = left
        self.right = right

def fib(n):
    if n <= 1:
        return Node(n, None, None)
    else:
        return Node(n, fib(n-1), fib(n-2))

def traverse(node):
    if node.left == None:
        print(f"#{node.id} [{node.n}] has no children")
    else:
        print(f"#{node.id} [{node.n}] has two children #{node.left.id} [{node.left.n}] and #{node.right.id} [{node.right.n}]")
        traverse(node.left)
        traverse(node.right)

def main():
    """Reads a user-specified non-negative integer n,
    and then prints the structure of the Fibonacci tree for F(n)."""

    n = int(stdin.readline())
    root = fib(n)
    traverse(root)

if __name__ == "__main__":
    print(main.__doc__)
    main()

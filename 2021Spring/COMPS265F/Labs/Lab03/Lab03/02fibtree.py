from sys import stdin
from graphviz import Graph

num_node = 0
tree = Graph()

class Node:
    def __init__(self, n, left, right):
        global num_node
        self.id = str(num_node)
        num_node += 1
        self.n = n
        self.left = left
        self.right = right

def fib(n):
    global tree
    if n <= 1:
        node = Node(n, None, None)
        tree.node(node.id, label=str(n))
    else:
        left_node = fib(n-1)
        right_node = fib(n-2)
        node = Node(n, left_node, right_node)
        tree.node(node.id, label=str(node.n))
        tree.edge(node.id, left_node.id)
        tree.edge(node.id, right_node.id)
    return node

def main():
    """Reads a user-specified non-negative integer n,
    and then prints the structure of the Fibonacci tree for F(n)."""
    global tree

    n = int(stdin.readline())
    root = fib(n)
    tree.view()

if __name__ == "__main__":
    print(main.__doc__)
    main()

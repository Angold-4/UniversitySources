"""
COMPS265F
Assignment1
q3.py

Name: Jiawei Wang
ID:   s1239587
"""

from graphviz import Graph

class Node:
    def __init__(self, label, left, right):
        self.label = label
        self.left = left
        self.right = right

def traverse(node):
    # original function time complexity: O(nlogn)
    # global tree Graph()
    global gtree
    if node.left == None:
        # if left is None then right also None (leaf) (complete binary tree)
        gtree.node(str(node.label))
    else:
        gtree.node(str(node.label))
        gtree.edge(str(node.label), str(node.left.label))
        gtree.edge(str(node.label), str(node.right.label))
        traverse(node.left)
        traverse(node.right)


def traverse1(node):
    # the answer of Q3(b)
    # time complexity: O(nlogn)
    # property: we must have at least one local minimum in every possible route of the tree
    # so we just need to search one route to find one of them

    if node.left.left == None:
        # if current node is the parent node of leaf node
        # then the local min must be one of them
        if node.left.label < node.label:
            print(node.left.label)
            return node.left
        print(node.label)
        return node


    else:
        # if not, we check whether it is a decreasing tree
        if node.left.label > node.label:
            # if not, current node is what we want
            print(node.label)
            return node
        else:
            # otherwise, keep searching the left tree
            traverse1(node.left)




if __name__ == '__main__':
    global gtree
    gtree = Graph()
    # n is the number of tree nodes, labeled from 0 to n-1
    # edges is a list of (parent, left child, right child)
    # Input 1:
    # n, root, edges = 7, 2, [(2,0,1), (0,3,4), (1,5,6)]
    # Input 2:
    n, root, edges = 7, 6, [(6,5,4), (5,1,0), (4,3,2)]

    nodes = [Node(i, None, None) for i in range(n)]
    root_node = nodes[root]

    for p, l, r in edges:
        nodes[p].left = nodes[l]
        nodes[p].right = nodes[r]


    traverse(root_node)
    print("The local minimum number is: ")
    traverse1(root_node) # 1

    gtree.view()

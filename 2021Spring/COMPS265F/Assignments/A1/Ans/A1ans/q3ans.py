from graphviz import Graph

class Node:
    def __init__(self, label, left, right):
        self.label = label
        self.left = left
        self.right = right

def traverse(node):
    if node.left == None:
        return node.label
    else:
        if node.left.label < node.right.label:
            min_node = node.left
        else:
            min_node = node.right

        if node.label < min_node.label:
            return node.label
        else:
            return traverse(min_node)

if __name__ == '__main__':
    global gtree
    gtree = Graph()
    # n is the number of tree nodes, labeled from 0 to n-1
    # edges is a list of (parent, left child, right child)
    # Input 1:
    n, root, edges = 7, 2, [(2,0,1), (0,3,4), (1,5,6)]
    # Input 2:
    # n, root, edges = 7, 6, [(6,5,4), (5,1,0), (4,3,2)]
    
    nodes = [Node(i, None, None) for i in range(n)]
    root_node = nodes[root]
    for p, l, r in edges:
        nodes[p].left = nodes[l]
        nodes[p].right = nodes[r]

    print(traverse(root_node))
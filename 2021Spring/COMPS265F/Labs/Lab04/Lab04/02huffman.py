from sys import stdin
from graphviz import Graph

num_node = 0

class Node:
    def __init__(self, freq, ch, left, right):
        global num_node
        self.id = str(num_node)
        num_node += 1
        self.freq = freq
        self.ch = ch  # None for internal nodes
        self.left = left
        self.right = right

class Huffman:
    def __init__(self, ch_freq):
        self.h = [] # a list for (freq, node)
        self.last = None  # keep the last created Note
        self.tree = Graph()

        for ch, freq in ch_freq:
           self.last = Node(freq, ch, None, None)
           self.h.append((freq, self.last))

        # Construct the Huffman  tree
        while len(self.h) >= 2:
            ind1 = self.h.index(min(self.h, key = lambda t: t[0]))
            f1, left = self.h[ind1]
            del self.h[ind1]

            ind2 = self.h.index(min(self.h, key = lambda t: t[0]))
            f2, right = self.h[ind2]
            del self.h[ind2]

            freq = f1 + f2
            self.last = Node(freq, None, left, right)
            self.h.append((freq, self.last))

        self.traverse(self.last)

    def showTree(self):
        self.tree.view()

    def traverse(self, node):
        if node.left == None: # it is a leaf
            self.tree.node(node.id, label=node.ch+"/"+str(node.freq))
        else:
            self.tree.node(node.id, label=str(node.freq))
            self.tree.edge(node.id, node.left.id, label="0")
            self.tree.edge(node.id, node.right.id, label="1")
            self.traverse(node.left)
            self.traverse(node.right)

def main():
    ch_freq = []
    for line in stdin:
        ch, freq = line.split()
        ch_freq.append( (ch,int(freq)) )

    huffman = Huffman(ch_freq)
    huffman.showTree()

if __name__ == "__main__":
    main()

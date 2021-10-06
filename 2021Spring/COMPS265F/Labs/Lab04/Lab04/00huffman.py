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
        self.h = [] # a list for (freq, node) self.last = None  # keep the last created Node
        self.last = None
        self.tree = Graph()
        # Your task:
        # Create leaf nodes for the Huffman tree
        # and store them in the list self.h

        # Construct a Node object table (without tree) (None)
        for ch, freq in ch_freq:
            self.last = Node(freq, ch, None, None)
            self.h.append((freq, self.last))
            self.tree.node(self.last.id, label = self.last.ch + '/' + str(self.last.freq))


        # Construct the Huffman tree
        while len(self.h) >= 2:
            # Your task:
            # Select the node with minimum frequency and remove it
            # Select another node with minimum frequency and remove it
            # Add the combined new node to self.h
            ind1 = self.h.index(min(self.h, key = lambda t : t[0]))
            f1, left = self.h[ind1]
            del self.h[ind1]

            ind2 = self.h.index(min(self.h, key = lambda t : t[0]))
            f2, right = self.h[ind2]
            del self.h[ind2]

            f = f1 + f2
            self.last = Node(f, None, left, right)
            self.h.append((f, self.last)); # self.h just help to caculate the final answer

            self.tree.node(self.last.id, label=str(f))
            self.tree.edge(self.last.id, left.id, label="0")
            self.tree.edge(self.last.id, right.id, label="1")


    def showTree(self):
        self.tree.view()

def main():
    ch_freq = []
    for line in stdin:
        ch, freq = line.split()
        ch_freq.append( (ch,int(freq)) )

    huffman = Huffman(ch_freq)
    huffman.showTree()

if __name__ == "__main__":
    main()

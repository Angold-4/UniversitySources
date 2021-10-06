from sys import stdin
from graphviz import Graph
import heapq

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

class Tuple:
    def __init__(self, val):
        self.val = val

    def __lt__(self, other):
        return self.val[0] < other.val[0]

class Huffman:
    def __init__(self, ch_freq):
        self.h = [] # a list for Tuple
        self.last = None  # keep the last created Note
        self.tree = Graph()
        self.code = {}

        for ch, freq in ch_freq:
           self.last = Node(freq, ch, None, None)
           heapq.heappush(self.h, Tuple((freq, self.last)))

        # Construct the Huffman  tree
        while len(self.h) >= 2:
            t1 = heapq.heappop(self.h)
            f1, left = t1.val

            t2 = heapq.heappop(self.h)
            f2, right = t2.val

            freq = f1 + f2
            self.last = Node(freq, None, left, right)
            heapq.heappush(self.h, Tuple((freq, self.last)) )

        self.traverse(self.last, "")

    def showTree(self):
        self.tree.view()

    def traverse(self, node, c):
        if node.left == None:
            self.tree.node(node.id, label=node.ch+"/"+str(node.freq))
            self.code[node.ch] = c
        else:
            self.tree.node(node.id, label=str(node.freq))
            self.tree.edge(node.id, node.left.id, label="0")
            self.tree.edge(node.id, node.right.id, label="1")
            self.traverse(node.left, c + "0")
            self.traverse(node.right, c + "1")

    def getCode(self):
        return self.code

def main():
    ch_freq = []
    for line in stdin:
        ch, freq = line.split()
        ch_freq.append( (ch,int(freq)) )

    huffman = Huffman(ch_freq)
    huffman.showTree()
    print(huffman.getCode())

if __name__ == "__main__":
    main()

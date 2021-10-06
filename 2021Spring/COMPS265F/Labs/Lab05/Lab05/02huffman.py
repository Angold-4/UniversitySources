from sys import stdin
from graphviz import Graph
from functools import total_ordering
import heapq

num_node = 0

@total_ordering
class Node:
    def __init__(self, freq, ch, left, right):
        global num_node
        self.id = str(num_node)
        num_node += 1 
        self.freq = freq
        self.ch = ch  # None for internal nodes
        self.left = left
        self.right = right

    def __eq__(self, other):
        return type(self) == type(other) and self.freq == other.freq

    def __lt__(self, other):
        return self.freq < other.freq

class Huffman:
    def __init__(self, ch_freq):
        self.h = [] # a list of Node objects
        self.last = None  # keep the last created Node
        self.tree = Graph()
        self.code = {}

        for ch, freq in ch_freq:
            self.last = Node(freq, ch, None, None)
            heapq.heappush(self.h, self.last)
            
        # Construct the Huffman tree 
        while len(self.h) >= 2:
            left = heapq.heappop(self.h)
            right = heapq.heappop(self.h)
            self.last = Node(left.freq + right.freq, None, left, right)
            heapq.heappush(self.h, self.last)
        
        self.traverse(self.last, "")

    def traverse(self, node, c):
        if node.left == None:
            self.tree.node(node.id, label=node.ch+"/"+str(node.freq))
            self.code[node.ch] = c
        else:
            self.tree.node(node.id, label=str(node.freq))
            self.tree.edge(node.id, node.left.id, label="0")
            self.tree.edge(node.id, node.right.id, label="1")
            self.traverse(node.left, c+"0")
            self.traverse(node.right, c+"1")

    def getCode(self):
        return self.code

    def showTree(self):
        self.tree.view()

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
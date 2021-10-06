"""
Question1 q1.py
Name: Jiawei Wang
ID: s1239587
"""

from sys import stdin
from collections import defaultdict

class Solution:
    # BFS Problem
    def __init__(self, n, edges, s, d, dl):
        self.n = n
        self.edges = edges
        self.s = s
        self.d = d
        self.dl = dl
        self.graph = defaultdict(list)

    def createGraph(self):
        '''Create an adjacency list by using self.edges to update self.graph'''
        for u, v in edges:
            self.graph[u].append(v)

    def bfs(self):
        '''Create the list self.dist using BFS from self.s'''
        self.dist = [None] * self.n # to store the minimum distance(BFS) from start to this element
        queue = []
        queue.append(self.s) # append the start
        self.dist[self.s] = 0 # start distance = 0
        while queue: # till do not have any element in queue means we cannot find a path from start to destination
            u = queue.pop(0)
            for i in self.graph[u]:
                if self.dist[i] == None: # which means this node we didn't came before
                    self.dist[i] = self.dist[u] + 1
                    if i == self.d:
                        # find it
                        return 
                    queue.append(i)

    def printResult(self):
        '''Create the shortest path distance from s to d, 
        if the path exists and is within distance dl''' 
        result = self.dist[self.d]
        if result == None:
            print("Cannot find the path!")
            return -1
        if result <= self.dl:
            print(result)
            return 0
        print("distance is larger than dl!")
        return -1


if __name__ == '__main__':
    type, n, m, s, d, dl = stdin.readline().split()
    n, m, s, d, dl = int(n), int(m), int(s), int(d), int(dl)
    edges = []
    if type == "u":
        # undirect
        for i in range(m):
            u,v = stdin.readline().split()
            u,v = int(u), int(v)
            edges.append((u,v))
            edges.append((v,u))
    else:
        # direct
        for i in range(m):
            u,v = stdin.readline().split()
            u,v = int(u), int(v)
            edges.append((u,v))
            
    s = Solution(n, edges, s, d, dl)
    s.createGraph()
    s.bfs()
    s.printResult()

class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        self.T = list(range(n))
        self.next = list(range(n))
        self.size = [1 for i in range(n)]
        self.numP = n   # no. of components
        
        for i in range(n):
            for j in range(n):
                if isConnected[i][j] == 1 and self.findSet(i) != self.findSet(j):
                    self.unionBySize(i, j)
                    self.numP -= 1
        
        return self.numP
    
    def findSet(self, x):
        return self.T[x]
    
    # update the name of the set containing b
    def union(self, a, b):
        i = b
        while True:
            self.T[i] = self.T[a]
            i = self.next[i]
            if i == b:
                break
        self.next[a], self.next[b] = self.next[b], self.next[a]
    
    def unionBySize(self, a, h):
        if self.size[a] > self.size[h]:
            self.union(a, h)
            self.size[a] += self.size[h]
        else:
            self.union(h, a)
            self.size[h] += self.size[a]
    

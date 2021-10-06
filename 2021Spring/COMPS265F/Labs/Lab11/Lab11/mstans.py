class Solution:
    def initArrays(self, n):
        self.T = list(range(n))
        self.next = list(range(n))
        self.size = [1 for i in range(n)]

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
        # Always add into the big group(union)
        if self.size[a] > self.size[h]:
            self.union(a, h)
            self.size[a] += self.size[h]
        else:
            self.union(h, a)
            self.size[h] += self.size[a]

    def mst(self, edges):
        mst_weight = 0
        for a, b, w in edges:
            if self.findSet(a) != self.findSet(b):
                mst_weight += w
                self.unionBySize(a, b)
        return mst_weight

if __name__ == '__main__':
    s = Solution()
    n = 5
    # edge is in the format [a, b, weight]
    edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]

    # Sort according to weight
    edges.sort(key = lambda x: x[-1])
    s.initArrays(n)
    print(s.mst(edges)) # answer = 7

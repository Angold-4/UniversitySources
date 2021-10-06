from typing import List

class Solution:
    def initArrays(self, n):
        self.T = list(range(n)) # initially their sets equals to their index
        self.next = list(range(n))
        # at least 1
        self.size = [1 for i in range(n)]

    def findSet(self, x):
        return self.T[x]

    # update the name of the set(with a) containing b
    def union(self, a, b):
        i = b
        while True:
            self.T[i] = self.T[a] # make b's set to be a's set
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

    def mst(self, edges):
        # build minimum spanning tree
        mst_weight = 0
        num_edge = 0
        for ind, a, b, w in edges: # ind has been added
            if self.findSet(a) != self.findSet(b): # else we do not need to union them since there is a circle
                mst_weight += w
                self.unionBySize(a, b)
        return mst_weight

    def findCriticalAndPseudoCriticalEdges(self, n: int, edges: List[List[int]]) -> List[List[int]]:
        # edge is in the format [index, a, b, weight]
        sorted_edges = [[ind]+edge for ind, edge in enumerate(edges)]

        # Sort according to weight
        sorted_edges.sort(key = lambda x: x[-1])


        self.initArrays(n)
        mst_weight = self.mst(sorted_edges)
        print("mst_weight: ", mst_weight) # 7

        c = [] # critical edge indices
        pc = [] # pseudo-critical edge indices
        for i, edge in enumerate(sorted_edges):
            ind, a, b, w = edge  # current edge
            new_edges = sorted_edges[:i] + sorted_edges[i+1:]  # omit current edge (do not contain i)

            # Step 1: Check whether MST can be obtained if current edge must be included
            self.initArrays(n)
            self.unionBySize(a, b)
            new_weight = self.mst(new_edges) + w

            # if a tree do not contain current edge cannot get the same mst_weight:
            if new_weight != mst_weight: # the current edge is not useful for MST
                continue

            # Step 2: Check whether MST can be obtained if current edge is omitted
            self.initArrays(n)
            new_weight = self.mst(new_edges)

            if new_weight != mst_weight: # the current edge is critical
                c.append(ind)
            else: # the current edge is pseudo-critical
                pc.append(ind)
        return c, pc

if __name__ == '__main__':
    s = Solution()
    n = 5
    # edge is in the format [a, b, weight]
    edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
    print(s.findCriticalAndPseudoCriticalEdges(n, edges))

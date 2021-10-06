from collections import defaultdict
from typing import List
import heapq

class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        self.graph = defaultdict(list)
        for u,v,w in times:
            self.graph[u-1].append((v-1, w))
        
        d = [float("inf") for i in range(n)]
        P = set()
        d[k-1] = 0
        
        q = [(d[i], i) for i in range(n)]
        heapq.heapify(q)
        
        while q:
            (du, u) = heapq.heappop(q)
            if u in P: # vertex u is in P
                continue
            
            P.add(u)
            for v,w in self.graph[u]:
                if v not in P:
                    # Relax edge (u,v)
                    if d[v] > d[u] + w:
                        d[v] = d[u] + w
                        heapq.heappush(q, (d[v], v))
        maxd = max(d)
        if maxd == float("inf"):
            return -1
        return maxd

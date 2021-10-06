class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        self.graph = defaultdict(list)
        for a, b in prerequisites:
            self.graph[b].append(a)

        visited = [0] * numCourses
        stack = []

        for s in range(numCourses):
            if visited[s] == 0: # not visited yet
                if self.dfs(s, visited, stack): # visit it
                    return []

        return stack[::-1]

    def dfs(self, x, visited, stack):
        if visited[x] == 1:
        # if it is gray -> which means it do not fit the property --
        # for any edge(u,v) in Graph, f[u] > f[v]
        # then return [] -- failed to sort
            return True

        if visited[x] == 2:
        # if it is black -> which means this backtracked node has no --
        # unvisited neighbour so it becomes finished
        # then return False -- do not need to dfs it
            return False

        visited[x] = 1 # mark it as visited
        for y in self.graph[x]:
            # self.graph[x] contains the child of x (the cources after x)
            if self.dfs(y, visited, stack):
                # dfs recursively
                return True
        stack.append(x)
        visited[x] = 2 # mark it as finished
        return False

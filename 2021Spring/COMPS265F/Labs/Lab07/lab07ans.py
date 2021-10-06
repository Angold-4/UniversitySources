from collections import defaultdict
from sys import stdin
from typing import List


class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        self.graph = defaultdict(list)
        wordList.insert(0, beginWord)
        self.numNodes = len(wordList)

        index = {}
        for i in range(len(wordList)):
            index[wordList[i]] = i

        if not endWord in index:
            return 0
        target = index[endWord]

        wordlen = len(beginWord)
        for i in range(self.numNodes):
            word = wordList[i]
            for j in range(wordlen):
                for c in range(26):
                    newword = word[:j] + chr(c+97) + word[j+1:]
                    if newword in index and newword != word:
                        self.graph[i].append(index[newword])
                        self.graph[index[newword]].append(i)

        dist = [None] * self.numNodes
        queue = []
        queue.append(0)

        dist[0] = 0
        while queue:
            u = queue.pop(0)
            for i in self.graph[u]:
                if dist[i] == None:
                    dist[i] = dist[u] + 1
                    if i == target:
                        return dist[i] + 1
                    queue.append(i)

        return 0

if __name__ == "__main__":
    beginWord = stdin.readline()
    endWord = stdin.readline()
    WordList = stdin.readline()

    S = Solution()
    ans = S.ladderLength(beginWord, endWord, WordList)
    print(ans)





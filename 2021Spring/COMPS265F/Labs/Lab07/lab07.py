from collections import defaultdict

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


from typing import List
from collections import defaultdict

def def_value() -> int:
    return 0;

def subseq(s: List[str], t: List[str]) -> bool:
    '''Return True if s is a subsequence of t;
    return False otherwise
    '''
    d = defaultdict(def_value)
    for st in t:
        d[st]+=1

    for st in s:
        if d[st] != 0:
            d[st]-=1
        else:
            return False

    return True

if __name__ == '__main__':
    t = ["wake up", "sleep", "wake up", "eat", "sleep"]
    s1 = ["wake up", "eat"]  
    s2 = ["eat", "eat"]
    print(subseq(s1, t))
    print(subseq(s2, t))

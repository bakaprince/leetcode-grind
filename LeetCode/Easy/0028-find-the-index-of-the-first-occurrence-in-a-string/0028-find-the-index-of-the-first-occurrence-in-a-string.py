class Solution(object):
    def strStr(self, haystack, needle):
        n=len(needle)
        for i in range(len(haystack)-n+1):
            if haystack[i:n+i] == needle:
                return i
        else:
            return -1

        
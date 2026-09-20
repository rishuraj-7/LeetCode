class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        clean=""
        for char in s:
            if char.isalnum():
                low=char.lower()
                clean=clean+low
        return clean==clean[::-1]
        
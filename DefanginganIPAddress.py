class Solution:
    def defangIPaddr(self, address: str) -> str:
        str = str.replace('.','[.]')
        return str;

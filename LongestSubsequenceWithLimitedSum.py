class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        sol = []
        nums.sort()
        for i in range(1,len(nums)):
            nums[i] += nums[i-1]

        for query in queries:
            index = bisect.bisect_right(nums, query)
            sol.append(index)

        return sol
            

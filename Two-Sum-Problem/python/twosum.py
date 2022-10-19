class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        rems: Dict[str, int] = {}
        for i in range(len(nums)):
            key = target - nums[i]
            if str(nums[i]) in rems.keys():
                return [rems[str(target - key)], i]
            else:
                rems[str(key)] = i
        return [-1, -1]
  

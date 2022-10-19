class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int rem = target - nums[i];
            if(table.containsKey(nums[i])){
                return new int[]{table.get(target - rem), i};
            }else{
                table.put(rem, i);
            }
        }
        return new int[]{-1,-1};
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> mm=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int tr=target-numbers[i];
            if(mm.containsKey(tr)){
                return new int[] {mm.get(tr),i+1};
            }
            mm.put(numbers[i],i+1);
        }

        return new int[0];
    }
}

class Es_07_GoodPairs {
    public int numIdenticalPairs(int[] nums){
        int count=0;
        //loop for last limit with which we are comparing element before the index less than j(limit)
        for(int j=1 ; j <nums.length ; j++){
            //comparing every element till j(limit)
            for(int i=0 ; i<j ; i++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

}
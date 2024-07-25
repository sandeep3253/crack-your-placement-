class duplicate {
    public List<Integer> findDuplicates(int[] nums) {
        Set <Integer> value = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
         for(int num:nums){
            if (value.contains(num)){
                duplicates.add(num);
            }
            else{
                value.add(num);
            }
         }
         return duplicates;
    }
} 


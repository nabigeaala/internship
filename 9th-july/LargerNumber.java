/*
Given a list of non-negative integers nums, arrange them such that they form the largest number
*/

class ComparatorClass implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        String ab= a+b;
        String ba= b+a;
        return ab.compareTo(ba)>0?-1:1;
    } 
}

class LargerNumber {
    public String largestNumber(int[] nums) {
          if(nums.length==0){
             return "";
         }
         String[] strArray= new String[nums.length];
         for(int i=0; i<nums.length; i++){
             strArray[i]= Integer.toString(nums[i]);
         }
        Arrays.sort(strArray, new ComparatorClass());
        if(strArray[0].equals("0"))
            return "0";
        String res="";
        for(int i=0;i<nums.length; i++){
            res+= strArray[i];
        }
        return res;
    }
}

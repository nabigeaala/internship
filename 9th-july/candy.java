/*
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.
*/
class Candy {
    public int candy(int[] ratings) {
        
        int temp[] = new int[ratings.length];
        
        //intialize with zero
        for(int i=0; i<temp.length; i++){
            temp[i] = 1;
        }
        //traverse from left to right
        for(int i=1; i<ratings.length; i++){
            if(ratings[i] > ratings[i-1] ){
                temp[i]= temp[i-1]+1;
            }
        }
        
       //traverse from right to left
        for(int i=ratings.length-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                temp[i] = Math.max(temp[i], temp[i+1] +1);
            }
        }
        
        int ans=0;
        for(int val : temp){
            System.out.print(val + " ");
            ans+= val;
        }
        
        return ans;
    }
}

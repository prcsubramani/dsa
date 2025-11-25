// Leetcode Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) { 
         // edge cases
         if(numbers ==null||numbers.length < 2){
              return new int[0];
         }		  
         Map<Integer,Integer> indicesMap = new HashMap<>();
          for(int i=0;i<numbers.length;i++) {
              int diff = target - numbers[i];
              if (indicesMap.containsKey(diff)) {
                  return new int[]{indicesMap.get(diff), i};
              }
              indicesMap.put(numbers[i],i);
          }
          return null;
    }
}
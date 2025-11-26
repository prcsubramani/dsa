  


   class Solution{

    public boolean containsDuplicate(int[] numbers){
      if(numbers == null || numbers.length <2){
          return false;
      }
      Set<Integer> set = new HashSet<>();
      return Arrays.stream(nums).anyMatch(x -> !set.add(x));    

    }
  }


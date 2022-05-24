import java.util.*;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < numbers.length; i++) {
            
            int sum = target - numbers[i];
            if(map.containsKey(sum)) {
                return new int[] {map.get(sum), i+1};
            }
            map.put(numbers[i] , i+1);
        }
        return null;
    }
}
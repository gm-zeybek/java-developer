import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSums1 {

    public static void main(String[] args) {
        int [] arr = new int []{2,7,9,11}; int target = 9;
        System.out.println(Arrays.toString(testArray(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr, target)));
    }


    public static int[] testArray(int[] array, int target) {
        for(int i= 0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++)
            if(array[i]+array[j]==target) return new int[]{i, j};
        }
        return new int []{};
    }

    public static int[] twoSum2(int[] array, int target){
        /// create hashmap
        Map<Integer, Integer> map = new HashMap<>();
        // iterate over the array , if a potential match exisit return
        for(int i= 0;i<array.length;i++){
        int potentialMatch = target - array[i];
        if(map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
        else map.put(array[i],i);
        }
    return new int[]{};
    }
}

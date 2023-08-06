import java.util.HashMap;
import java.util.Map;

public class MapReview1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergio");
        map.put(2, "Moses");
        System.out.println(map.get(2));
        System.out.println(findFirstNonRepeating("cydeo java developer"));

    }

    public static Character findFirstNonRepeating(String str){
        Map<Character, Integer> map1 =  new HashMap<>();
        int count;
        for(Character ch:str.toCharArray()){
            if (map1.containsKey(ch)) {
                count = map1.get(ch);
                map1.put(ch, count + 1);
            } else map1.put(ch, 1);
        }
        for (Character chr : str.toCharArray()) {
            if (map1.get(chr)==1) return chr;
            }
        return Character.MIN_VALUE;
        }

}

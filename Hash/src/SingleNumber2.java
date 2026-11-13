import java.util.*;
public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1,2,4,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> pair: map.entrySet()){
            if(pair.getValue() == 1){
                System.out.println(pair.getKey());
                break;
            }
        }
    }
}

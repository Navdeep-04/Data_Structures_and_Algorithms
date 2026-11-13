import java.util.*;
public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                System.out.println(num);
                break;
            }
        }
    }
}

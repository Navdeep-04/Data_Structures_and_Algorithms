import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int prefixSum = 0;
        int longest = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i] == 0 ? -1 : 1;
            if(prefixSum == 0){
                longest = i+1;
            }
            else if(map.containsKey(prefixSum)){
                longest = Math.max(longest, i - map.get(prefixSum));
            }
            else{
                map.put(prefixSum,i);
            }
        }
        System.out.println(longest);
    }
}

import java.util.HashSet;
import java.util.Set;

public class FindDistinctElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set.size());
    }
}

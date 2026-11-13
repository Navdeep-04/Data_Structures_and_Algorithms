import java.util.*;

public class UnionOfArrayWithDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        Set<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
        }
        for(int num: b){
            set.add(num);
        }
        System.out.println(set);
    }
}

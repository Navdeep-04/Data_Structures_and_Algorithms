import java.util.*;
public class UnionOfArrayWithDuplicates1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        List<Integer> list = new ArrayList<>();
        for(int num: a){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        for(int num: b){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(nonOver(intervals));
    }
    static int nonOver(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int remove = 0;
        int end = Integer.MIN_VALUE;
        for(int[] interval: intervals) {
            if(interval[0] >= end){
                end = interval[1];
            }
            else{
                remove++;
            }
        }
        return remove;
    }
}

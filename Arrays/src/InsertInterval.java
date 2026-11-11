import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] result = insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            // CASE 1: Current interval is before newInterval
            // No overlap, so directly add current interval
            if (interval[1] < newInterval[0]){
                result.add(interval);
            }
            // CASE 2: New interval is before current interval
            // Add newInterval and move current interval into newInterval
            else if(newInterval[1] < interval[0]){
                result.add(newInterval);
                // Update newInterval to the current interval
                newInterval = interval;
            }
            else{
                // CASE 3: Both intervals overlap
                // Merge them into one larger interval
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        // Add the last remaining interval
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}

import java.util.*;
public class InsertDeleteGetRandom {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> arr;
    private Random random;
    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean isExist = map.containsKey(val);
        if(!isExist){
            arr.add(val);
            map.put(val, arr.size() - 1);
        }
        return !isExist;
    }

    public boolean remove(int val) {
        boolean isExist = map.containsKey(val);
        if(isExist){
            int index = map.get(val);
            int lastValue = arr.get(arr.size()-1);
            arr.set(index, lastValue); // arr[index] = lastIndex
            map.put(lastValue, index);

            arr.remove(arr.size() - 1);  // removing last element
            map.remove(val);
        }
        return isExist;
    }

    public int getRandom() {
        int index = random.nextInt(arr.size());
        return arr.get(index);
    }
}

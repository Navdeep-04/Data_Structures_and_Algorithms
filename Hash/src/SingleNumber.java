public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int xor = 0;
        for(int x: nums){
            xor ^= x;
        }
        System.out.println(xor);
    }
}

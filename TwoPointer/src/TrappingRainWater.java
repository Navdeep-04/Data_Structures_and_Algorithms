public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int start = 0;
        int sum = 0;
        int startMax = 0;
        int endMax = 0;
        int end = height.length - 1;
        while(start < end){
            if(height[start] <= height[end]) {
                if (height[start] > startMax) {
                    startMax = height[start];
                } else {
                    sum += startMax - height[start];
                }
                start++;
            }
            else{
                if(height[end] > endMax){
                    endMax = height[end];
                }
                else{
                    sum += endMax - height[end];
                }
                end--;
            }
        }
        System.out.println(sum);
    }
}

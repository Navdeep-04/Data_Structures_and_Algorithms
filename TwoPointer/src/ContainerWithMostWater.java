public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int start = 0;
        int area = 0;
        int end = height.length - 1;
        while(start < end){
            int newheight = Math.min(height[start], height[end]);
            int width = end - start;
            area = Math.max(newheight * width, area);
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(area);
    }
}

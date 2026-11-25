public class TrappingRainWater1 {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find maximum height on the left
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            // Find maximum height on the right
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            // Calculate trapped water
            int water = Math.min(leftMax, rightMax) - height[i];
            sum += water;
        }
        System.out.println("Trapped Water: " + sum);
    }
}

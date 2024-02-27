public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, maxHeight = 0;
        while (start != end) {
            if (height[start] < height[end]) {
                maxHeight = Math.max(maxHeight, (height[start] * (end - start)));
                start++;
            }
            else if (height[start] > height[end]) {
                maxHeight = Math.max(maxHeight, (height[end] * (end - start)));
                end--;
            }
            //Both are equal, just change start
            else {
                maxHeight = Math.max(maxHeight, (height[start] * (end - start)));
                start++;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] array = {1,1};
        System.out.println(container.maxArea(array));
    }
}

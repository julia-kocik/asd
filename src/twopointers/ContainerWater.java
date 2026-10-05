package twopointers;

public class ContainerWater {
    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            //szerokość
            int width = right - left;
            //wysokość
            int h = Math.min(height[left], height[right]);

            //pole
            int area = width*h;

            // najlepszy wynik zapamiętujemy
            max = Math.max(max, area);

            //wyrzucamy niższą ścianę
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}

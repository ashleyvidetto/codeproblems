import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        int[] nums = {15, 11, 7, 2};
        int[] answer = sortArrays(nums, 9);
        for (int i : answer) {
            System.out.println(i);
        }
        int[] nums2 = {-1, -2, -3, -4, -5};
        int[] answer2 = sortArrays(nums2, -8);
        for (int i : answer2) {
            System.out.println(i);
        }

    }

    private static int[] sortArrays(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                continue;
            }
            int differenceNeeded = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if (differenceNeeded == nums[j]){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }


}

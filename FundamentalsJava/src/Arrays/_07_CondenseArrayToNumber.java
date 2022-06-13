package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums  = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = nums.length -1;



        while (count>0){
            int[] condensed = new int[nums.length -1];

            for (int i = 0; i < condensed.length ; i++) {

                condensed[i] = nums[i] + nums[i +1];

            }

            Arrays.fill(nums, 0);

            System.arraycopy(condensed, 0, nums, 0, nums.length - 1);

            count--;
        }

        System.out.println(nums[0]);
    }
}

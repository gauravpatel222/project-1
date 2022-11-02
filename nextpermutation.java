import java.util.*;

public class Main {
    public static void interchange(int[] nums, int ind_1, int ind_2) {
        int temp = nums[ind_1];
        nums[ind_1] = nums[ind_2];
        nums[ind_2] = temp;
    }

    public static void reverse(int[] nums, int s_pt, int e_pt) {
        while (s_pt < e_pt) {
            interchange(nums, s_pt++, e_pt--);
        }
    }

    public static void othernumsay(int[] nums) {
        if (nums.length <= 1)
            return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            interchange(nums, i, j);

        }
        reverse(nums, i + 1, nums.length - 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            othernumsay(nums);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            test--;
        }
        sc.close();
    }
}
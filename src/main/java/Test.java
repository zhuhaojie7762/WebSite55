import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;

        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (i >= m && n > 0) {
                    nums1[i] = nums2[i - n];
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums1[j] < nums1[i]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }
        }
    }


    public static String getValue() {
        String value = null;
        try {
            int a = 1 / 0;
            value = "A";
        } catch (Exception e) {
            System.out.println(e);
            value = "B";
        } finally {
            value = "C";
        }
        return value;
    }

    public static int getValue(int a) {
        int i = 1;
        try {
            i++;
            return i;
        } catch (Exception e) {
            System.out.println(e);
            i = 66;
        } finally {
            i = 100;
            return i;
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        test.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(getValue(11));
    }
}

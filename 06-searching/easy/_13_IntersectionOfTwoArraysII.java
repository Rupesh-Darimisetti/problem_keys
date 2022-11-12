package easy;

class _13_IntersectionOfTwoArraysII{
          public static void main(String[] args, int[] is) {

              int[]  nums1 = {4,9,5}, nums2 = {9,4,9,8,4}; // Output: [4,9]

              int[] intersection = intersection(nums1, nums2);
              System.out.println(Arrays.toString(intersection));
          }

           public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])     i++;
            else if (nums1[i] > nums2[j])  j++;
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int ans[] = new int[list.size()];
        int index = 0;
        for (int ele : list) {
            ans[index++] = ele;
        }
        return ans;
    }
}
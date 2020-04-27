package edu.common.leetcode;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int array1[] = {1, 2};
        int array2[] = {-1, 3};
        System.out.println(findMedianValue(array1, array2));
    }

    public static double findMedianValue(int nums1[], int nums2[])
    {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left)
                + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }
    public static int getKth(int nums1[], int start1, int end1, int nums2[], int start2, int end2, int k)
    {
        int array1Len = end1 - start1 + 1;
        int array2Len = end2 - start2 + 1;
        if (array1Len > array2Len) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (array1Len == 0) return  nums2[start2 + k - 1];
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        int middleIndex1 = start1 + Math.min(array1Len, k / 2) - 1;
        int middleIndex2 = start2 + Math.min(array2Len, k / 2) - 1;
        if (nums1[middleIndex1] > nums2[middleIndex2])
        {
            return getKth(nums1, start1, end1, nums2, middleIndex2 + 1, end2, k - (middleIndex2 - start2 + 1));
        }else
        {
            return getKth(nums1, middleIndex1 + 1, end1, nums2, start2, end2, k - (middleIndex1 - start1 + 1));
        }
    }
}

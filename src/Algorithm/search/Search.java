package edu.common.search;

public class Search {
    public static int binarySearch(int[] arr, int value) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex;
        while (minIndex <= maxIndex) {
            midIndex = minIndex + (maxIndex - minIndex) / 2;
            if (arr[midIndex] > value){
                maxIndex = midIndex - 1;
            }else if (arr[midIndex] < value){
                minIndex = midIndex + 1;
            }else {
                return midIndex;
            }
        }
        return -1;
    }
}

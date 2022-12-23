// max and min of array

public class MaxMinArray {
    static class Pair {
        int min;
        int max;

        
    }
    static Pair getMinMax(int arr[],int n){
        Pair minMax=new Pair();
        int i;
        if (n==1) {
            minMax.max=arr[0];
            minMax.min=arr[0];
            return minMax;
        }
        if (arr[0]>arr[1]) {
            minMax.max=arr[0];
            minMax.min=arr[1];
            
        }
        else{
            minMax.max=arr[1];
            minMax.min=arr[0];
        }
        for ( i = 2; i < n; i++) {
            if (arr[i]>minMax.max) {
                minMax.max=arr[i];
            }
            else if (arr[i]<minMax.min) {
                minMax.min=arr[i];
            }
        }
        return minMax;

    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax=getMinMax(arr, arr_size);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author Halil
 */
public class MergeSort {

    public static void mergeSort(int[] dizi, int n) 
    {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = dizi[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = dizi[i];
        System.out.println(Arrays.toString(dizi));
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(dizi, l, r, mid, n - mid);
    System.out.println(Arrays.toString(dizi));
}
   public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
   public static void main(String args[])
   {
       int[] dizi = { 5, 1,4,5,6,8};
       int n= dizi.length;
       MergeSort.mergeSort(dizi,n);
   }
}

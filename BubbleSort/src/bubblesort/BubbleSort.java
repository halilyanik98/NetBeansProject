/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author Halil
 */
public class BubbleSort {
    

    public static void main(String[] args) 
    {
        int[] dizi={9,8,7,6,5,4,3,2,1,0};
            int n = dizi.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (dizi[j] > dizi[j+1])
                {                
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
        System.out.println(Arrays.toString(dizi));
    }
}

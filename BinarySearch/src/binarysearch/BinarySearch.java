/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Halil
 */
class BinarySearch
{
    int binarySearch(int dizi[], int sol, int sag, int x)
    {
        if (sag>=sol)
        {
            int orta = sol+ (sag - sol)/2;
 
            if (dizi[orta] == x)
               return orta;
  
            if (dizi[orta] > x)
               return binarySearch(dizi, sol, orta-1, x);
 
            return binarySearch(dizi, orta+1, sag, x);
        }
  
        return -1;
    }
  
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int dizi[] = {3,5,7,9,12,14,17,18,19,22,26,35};
        int n = dizi.length;
        int aranan =19;
        int fonksiyon = ob.binarySearch(dizi,0,n-1,aranan);
        if (fonksiyon == -1)
            System.out.println("Değer dizide yok");
        else
            System.out.println("Değer şu indexte bulundu => "+fonksiyon);
    }
}